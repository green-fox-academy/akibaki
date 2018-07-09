package com.greenfox.restbackend.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubling {
  int received;
  int result;

  public Doubling(int input){
    this.received = input;
    result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
