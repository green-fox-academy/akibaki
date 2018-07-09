package com.greenfox.restbackend.Model;

public class UntilResult {
  int result;

  public UntilResult(String what, Integer until) {
    if (what.equals("sum")){
      result = sum(until);
    } else if (what.equals("factor")){
      result = fact(until);
    }
  }

  public int sum(int until) {
    int result = 1;
    for (int i = 1; i < until; i++) {
      result += (i + 1);
    }
    return result;
  }

  public int fact(int until) {
    int result = 1;
    for (int i = 0; i < until; i++) {
      result *= (i + 1);
    }
    return result;
  }


  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
