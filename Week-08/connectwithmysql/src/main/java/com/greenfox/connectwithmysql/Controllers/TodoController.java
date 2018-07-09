package com.greenfox.connectwithmysql.Controllers;

import com.greenfox.connectwithmysql.Model.ToDo;
import com.greenfox.connectwithmysql.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TodoController {

  @Autowired
  Repo repo;

  @GetMapping("/todo")
  public String todo() {
    repo.save(new ToDo("vakond"));
    return "/todo";
  }

  @GetMapping(value = {"", "/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive) {

    if (isActive == null || !isActive.equals("true")){
      model.addAttribute("todos", repo.findAll());
    }
    else {
      model.addAttribute("todos", repo.findByDone(false));
    }
    return "todolist";
  }

  @GetMapping(value = {"/list/add"})
  public String addList(Model model) {
    model.addAttribute("todo", new ToDo());
    return "addtodo";
  }
  @PostMapping(value = {"/list/add"})
  public String listAdded(@ModelAttribute ToDo todo) {
    repo.save(todo);
    return "redirect:/list";
  }

  @GetMapping(value = {"/{todo.id}/delete"})
  public String deleteFromList( @PathVariable("todo.id") long id) {
    repo.deleteById(id);
    return "redirect:/list";
  }

  @GetMapping(value = {"/{todo.id}/edit"})
  public String editToDo(Model model, @PathVariable("todo.id") long id) {
    model.addAttribute("todo", repo.findById(id).get());
    return "edittodo";
  }

  @PostMapping(value = {"/{todo.id}/edit"})
  public String editedToDo(@ModelAttribute("todo") ToDo todo) {
    repo.save(todo);
    return "redirect:/list";
  }

}

