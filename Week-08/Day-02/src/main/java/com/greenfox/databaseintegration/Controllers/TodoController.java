package com.greenfox.databaseintegration.Controllers;

import com.greenfox.databaseintegration.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @Autowired
  Repo repo;

  @GetMapping("/todo")
  public String todo() {

    return "/todo";
  }

  @ResponseBody
  @GetMapping(value = {"", "/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", repo.findAll());
    return "todolist";
  }
}

