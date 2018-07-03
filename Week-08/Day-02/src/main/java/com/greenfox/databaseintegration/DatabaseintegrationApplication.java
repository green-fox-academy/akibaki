package com.greenfox.databaseintegration;

import com.greenfox.databaseintegration.Model.ToDo;
import com.greenfox.databaseintegration.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DatabaseintegrationApplication implements CommandLineRunner {

  @Autowired
  Repo repo;

  @Override
  public void run(String... args) throws Exception {
    repo.save(new ToDo(0 ,"I have to learn Object Relational Mapping"));
  }

  public static void main(String[] args) {
    SpringApplication.run(DatabaseintegrationApplication.class, args);
  }
}
