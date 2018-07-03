package com.greenfox.databaseintegration.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToDo {

  @Id
  long id;
  String title;
  boolean urgent;
  boolean done;

  public ToDo(long id, String title){
    this.id = id;
    this.title = title;
    urgent = false;
    done = false;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
