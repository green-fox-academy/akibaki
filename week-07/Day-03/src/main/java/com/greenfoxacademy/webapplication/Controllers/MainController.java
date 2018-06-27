package com.greenfoxacademy.webapplication.Controllers;

import com.greenfoxacademy.webapplication.Services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @RequestMapping("/useful")
  public String useful(Model model) {
        return "useful";
  }

  @RequestMapping("/useful/colored")
  public String color(Model model) {
    UtilityService utilityService = new UtilityService();
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }
}
