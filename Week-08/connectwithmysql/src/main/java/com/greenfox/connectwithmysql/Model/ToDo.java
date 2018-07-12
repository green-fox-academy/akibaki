package com.greenfox.connectwithmysql.Model;

import javax.persistence.*;

@Entity
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String title;
  boolean urgent;
  boolean done;

  @OneToOne()
  @JoinColumn(name = "assignee")
  private Assignee assignee;

  public ToDo() {

  }

  public ToDo(String title) {
    this.title = title;
    urgent = false;
    done = false;
    assignee = new Assignee("","");
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}