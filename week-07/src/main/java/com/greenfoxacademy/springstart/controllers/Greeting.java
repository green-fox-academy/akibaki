package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  private long id;
  private String content;

  Greeting(long id, String content){
    this.id = id;
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public long getId() {
    return id;
  }
}
