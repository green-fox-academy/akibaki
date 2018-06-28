package com.greenfoxacademy.webapplication.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public boolean validateEmail(String emailAdress){
    boolean at = false;
    boolean dot = false;
    for (String letter : emailAdress.split("")){
      if (letter.equals("@")){
        at = true;
      }
      if (letter.equals(".")){
        dot = true;
      }
    }
    return (at && dot);
  }
}