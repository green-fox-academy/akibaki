package com.greenfoxacademy.bankofsimba.Controller;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/show")
    public String greeting(Model model) {
      BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
      model.addAttribute("bankAccount", bankAccount);
      return "show";
    }

  @GetMapping("/embeddedHtml")
  public String embeddedHtml(Model model){
    String text ="This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
  return "embeddedHtml";
    }

  @GetMapping("/list")
  public String list(Model model){
    List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
    bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    bankAccounts.add(new BankAccount("Timon", 20, "opossum", true));
    bankAccounts.add(new BankAccount("Pumba", 200, "pig"));
    bankAccounts.add(new BankAccount("Zordon", 20000, "lion"));
    model.addAttribute("bankAccounts", bankAccounts);
    return "list";
  }

  }

