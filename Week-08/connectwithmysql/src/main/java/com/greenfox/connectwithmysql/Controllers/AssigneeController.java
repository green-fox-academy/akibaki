package com.greenfox.connectwithmysql.Controllers;

import com.greenfox.connectwithmysql.Model.Assignee;
import com.greenfox.connectwithmysql.Model.ToDo;
import com.greenfox.connectwithmysql.Repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssigneeController {

  @Autowired
  AssigneeRepository assigneerepo;


  @GetMapping(value = {"/assignees"})
  public String list(Model model){
    model.addAttribute("assignees", assigneerepo.findAll());
    return "assignees";
  }


  @GetMapping(value = {"/assignees/add"})
  public String addList(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "addassignee";
  }
  @PostMapping(value = {"/assignees/add"})
  public String listAdded(@ModelAttribute Assignee assignee) {
    System.out.println(assignee);
    assigneerepo.save(assignee);
    return "redirect:/assignees";
  }

  @GetMapping(value = {"/assignees/{assignee.id}/delete"})
  public String deleteFromList( @PathVariable("assignee.id") long id) {
    assigneerepo.deleteById(id);
    return "redirect:/assignees";
  }

  @GetMapping(value = {"/assignees/{assignee.id}/edit"})
  public String editToDo(Model model, @PathVariable("assignee.id") long id) {
    model.addAttribute("assignee", assigneerepo.findById(id).get());
    System.out.println(model.asMap().get("assignee"));
    return "editassignee";
  }

  @PostMapping(value = {"/assignees/{assignee.id}/edit"})
  public String editedToDo(@ModelAttribute("assignee") Assignee assignee) {
    assigneerepo.save(assignee);
    return "redirect:/assignees";
  }

}
