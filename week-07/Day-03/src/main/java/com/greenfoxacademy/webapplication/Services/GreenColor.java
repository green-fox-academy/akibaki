package com.greenfoxacademy.webapplication.Services;

import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("this is green");
  }
}
