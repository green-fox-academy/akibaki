package com.greenfoxacademy.webapplication.Controllers;

import com.greenfoxacademy.webapplication.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @Autowired
  UtilityService utilityService;

  @RequestMapping("/useful")
  public String useful() {
        return "useful";
  }

  @RequestMapping("/useful/colored")
  public String color(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping(value = "/useful/email")
  public String email(@RequestParam(value = "email") String email, Model model) {
    model.addAttribute("email", email );
    System.out.println(email);
    model.addAttribute("valid", utilityService.validateEmail(email));
    return "email";
  }
}
