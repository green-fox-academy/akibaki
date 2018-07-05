package com.greenfox.connectwithmysql.Repository;

import com.greenfox.connectwithmysql.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface Repo extends CrudRepository<ToDo, Long> {
   List<ToDo> findByDone(boolean done);
}
