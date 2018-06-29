package com.greenfoxacademy.programmerfoxclub.Models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  String name;
  String food;
  String drink;
  List<String> tricks;

  public Fox(){
    this("Burkus");
  }

  public Fox(String name){
    this(name, "salad", "water", new ArrayList<String>());
  }

  public Fox(String name, String food, String drink, List<String> tricks){
    this.name = name;
    this.food = food;
    this.drink = drink;
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }
}
