package com.greenfox.restbackend;

import com.greenfox.restbackend.Controllers.MainController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void doubling() throws Exception{
    mockMvc.perform(get("/doubling?input=15"))
              .andExpect(status().isOk())
              .andExpect(jsonPath("$.result", is(30)));
    }

  @Test
  public void doubling_error() throws Exception{
    mockMvc.perform(get("/doubling"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }
  @Test
  public void greeting() throws Exception {
    mockMvc.perform(get("/greeter?name=Petike&title=student"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
  }

  @Test
  public void greeting_missing_name() throws Exception {
    mockMvc.perform(get("/greeter?title=student"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }
  @Test
  public void greeting_missing_parameters() throws Exception {
    mockMvc.perform(get("/greeter"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }
  @Test
  public void greeting_missing_title() throws Exception {
    mockMvc.perform(get("/greeter?name=Petike"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Please provide a title!")));
  }


  @Test
  public void appenda() throws Exception {
    mockMvc.perform(get("/appenda/kuty"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.appended", is("kutya")));
  }
  @Test
  public void appenda_without_parameter() throws Exception {
    mockMvc.perform(get("/appenda"))
            .andExpect(status().is(404));
  }
  @Test
  public void dountil_sum() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\":\"5\" }"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(15)));
  }

  @Test
  public void dountil_factor() throws Exception {
    mockMvc.perform(post("/dountil/factor")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\":\"5\" }"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(120)));
  }

  @Test
  public void dountil_without_number() throws Exception {
    mockMvc.perform(post("/dountil/factor")
            .contentType(MediaType.APPLICATION_JSON)
            .content(""))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a number!")));
  }

  @Test
  public void dountil_without_what() throws Exception {
    mockMvc.perform(post("/dountil")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\":\"5\" }"))
            .andExpect(status().is(404));
  }
}