package com.greenfox.numbers.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Numbers {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private Integer[] numbers;

  Numbers(){

  }

  public Numbers(Integer[] numbers) {

    this.numbers = numbers;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }

}
