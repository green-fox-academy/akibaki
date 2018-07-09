package com.greenfox.restbackend.Model;

public class AppendA {
  String appended;

  public AppendA(String appendable) {
    appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

}
