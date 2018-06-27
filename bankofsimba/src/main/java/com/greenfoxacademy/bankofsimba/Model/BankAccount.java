package com.greenfoxacademy.bankofsimba.Model;

import org.springframework.format.annotation.NumberFormat;

import java.text.DecimalFormat;

public class BankAccount {

  String name;
  double balance;
  String animalType;

  public BankAccount(String name, double balance, String animalType){
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}