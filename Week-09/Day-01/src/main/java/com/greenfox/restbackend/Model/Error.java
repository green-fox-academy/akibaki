package com.greenfox.restbackend.Model;

public class Error {
  String error;

  public Error(String message){
    error = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
