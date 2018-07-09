package com.greenfox.restbackend.Model;

public class DoUntil {
  int until;

  public DoUntil() {
    until = 1;
  }


  public DoUntil( int what){
      until = what;
    }

    public int getUntil () {
      return until;
    }

    public void setUntil ( int until){
      this.until = until;
    }
  }
