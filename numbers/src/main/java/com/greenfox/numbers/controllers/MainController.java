package com.greenfox.numbers.controllers;

import com.greenfox.numbers.models.Numbers;
import com.greenfox.numbers.services.NumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
public class MainController {

@Autowired
  NumbersService numbersService;

private Integer sum = 0;
private String squares = null;

@GetMapping("/")
  public String index(Model model){
  String numbers = "";
  model.addAttribute("numbers" , numbers);
  model.addAttribute("allNumbers", numbersService.numbersList());
  if (squares != null){
    model.addAttribute( "othermessage", "The summary of the selected numbers are: " + sum + ", the square values are: " + squares);
    squares=null;
  }
  return "index";
}

  @PostMapping("/")
  public String importNumbers(@RequestParam String[] numbers, Model model){
  String message = numbersService.saveNumbers(numbersService.validateAndConvert(numbers));
  model.addAttribute("message" , message);

  if (message.equals("Numbers are correct and saved.") )  {
    model.addAttribute("savedNumbers", Arrays.toString(numbersService.numbersList().get(numbersService.numbersList().size() - 1).getNumbers()));
  }
  model.addAttribute("allNumbers", numbersService.numbersList());
//    System.out.println(numbersService.sum(numbersService.validateAndConvert(numbers)));
//    System.out.println(Arrays.toString(numbersService.squares(numbersService.validateAndConvert(numbers))));
//    System.out.println(Arrays.toString(numbersService.numbersList().get(5).getNumbers()));
  return "index";
  }

  @PostMapping("/sumsquare")
  public String evaluateNumbers(@RequestParam(value= "id") Long id){
  sum = numbersService.sum(numbersService.findById(id));
  squares = Arrays.toString(numbersService.squares(numbersService.findById(id)));
    System.out.println("The summary of the selected numbers are: " + sum + ", the square values are: " + squares);
  return "redirect:/";
}


}
