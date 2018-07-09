package com.greenfox.restbackend.Controllers;

import com.greenfox.restbackend.Model.*;
import com.greenfox.restbackend.Model.Error;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @GetMapping("/")
  public String mainPage() {
    return "index";
  }

  @ResponseBody
  @GetMapping("/doubling")
  public Object doubling(@RequestParam(name = "input", required = false) String input) {
    if (input == null) {
      return new Error("Please provide an input!");
    } else {
      return new Doubling(Integer.valueOf(input));
    }
  }

  @ResponseBody
  @GetMapping("/greeter")
  public Object greeting(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title) {
    if (name == null) {
      return new Error("Please provide a name!");
    } else if (title == null) {
      return new Error("Please provide a title!");
    }

    return new Greeting(name, title);
  }

  @ResponseBody
  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable ("appendable")String appendable) {
    return new AppendA(appendable);
  }

  @ResponseBody
  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable ("what")String what, @RequestBody(required = false) DoUntil doUntil) {

    if (doUntil == null || doUntil.getUntil()== -1){
      return new Error("Please provide a number!");
    } else{

      return new UntilResult(what, doUntil.getUntil());
    }
  }
}