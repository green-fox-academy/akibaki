package com.greenfox.connectwithmysql.Controllers;

import com.greenfox.connectwithmysql.Model.Assignee;
import com.greenfox.connectwithmysql.Model.ToDo;
import com.greenfox.connectwithmysql.Repository.AssigneeRepository;
import com.greenfox.connectwithmysql.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;


@Controller
public class TodoController {

  @Autowired
  ToDoRepository toDoRepo;
  @Autowired
  AssigneeRepository assigneeRepo;


  @GetMapping("/todo")
  public String todo() {
    toDoRepo.save(new ToDo("vakond"));
    return "/todo";
  }

  @GetMapping(value = {"", "/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive, @RequestParam(value = "search", required = false) String search) {

//    if (isActive == null || !isActive.equals("true")){
//      model.addAttribute("todos", toDoRepo.findAll());
//    }
//    else {
//      model.addAttribute("todos", toDoRepo.findByDone(false));
//    }

    if (search == null && (isActive == null || !isActive.equals("true"))){
      model.addAttribute("todos", toDoRepo.findAll());
    }
    else if(search != null && (isActive == null || !isActive.equals("true"))){
      model.addAttribute("todos", toDoRepo.findAllByTitleContaining(search));
    }
    else if (search == null){
      model.addAttribute("todos", toDoRepo.findByDone(false));
    }
    else {
      model.addAttribute("todos", toDoRepo.findByDoneAndTitleContaining(false, search));
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
    toDoRepo.save(todo);
    return "redirect:/list";
  }

  @GetMapping(value = {"/{todo.id}/delete"})
  public String deleteFromList( @PathVariable("todo.id") long id) {
    toDoRepo.deleteById(id);
    return "redirect:/list";
  }

  @GetMapping(value = {"/{todo.id}/edit"})
  public String editToDo(Model model, @PathVariable("todo.id") long id) {
    model.addAttribute("todo", toDoRepo.findById(id).get());
    model.addAttribute("assignees", assigneeRepo.findAll());
    return "edittodo";
  }

  @PostMapping(value = {"/{todo.id}/edit"})
  public String editedToDo(@ModelAttribute("todo") ToDo todo) {
    Assignee addedAssignee = todo.getAssignee();
    addedAssignee.addTodo(todo);
    assigneeRepo.save(addedAssignee);
    toDoRepo.save(todo);
    return "redirect:/list";
  }



}

