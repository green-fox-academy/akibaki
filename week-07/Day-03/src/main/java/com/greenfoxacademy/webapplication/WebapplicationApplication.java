package com.greenfoxacademy.webapplication;

import com.greenfoxacademy.webapplication.Services.GreenColor;
import com.greenfoxacademy.webapplication.Services.Printer;
import com.greenfoxacademy.webapplication.Services.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebapplicationApplication implements CommandLineRunner {
  @Autowired
  Printer printer;

  @Autowired
  RedColor redColor;

  @Autowired
  GreenColor greenColor;

  public static void main(String[] args) {
    SpringApplication.run(WebapplicationApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Hello");
    redColor.printColor();
    greenColor.printColor();

  }
}
