package com.greenfox.connectwithmysql.Repository;

import com.greenfox.connectwithmysql.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
   List<ToDo> findByDone(boolean done);
   List<ToDo>  findAllByTitleContaining(String search);
   List<ToDo> findByDoneAndTitleContaining(boolean b, String search);
}
