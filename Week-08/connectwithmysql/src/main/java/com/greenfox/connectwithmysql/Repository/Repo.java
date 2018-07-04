package com.greenfox.connectwithmysql.Repository;

import com.greenfox.connectwithmysql.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface Repo extends CrudRepository<ToDo, Long> {

}
