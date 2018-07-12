package com.greenfox.connectwithmysql.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  Long id;


  String name;
  String email;
  @OneToMany(mappedBy = "assignee")
  List<ToDo> todos;


  public Assignee(){

  }

  Assignee(String name, String email) {
  this.name = name;
  this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void addTodo(ToDo todo) {
    todos.add(todo);
  }

  public List<ToDo> getTodos() {
    return todos;
  }

  public void setTodos(List<ToDo> todos) {
    this.todos = todos;
  }
}
