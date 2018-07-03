package com.greenfox.databaseintegration.Repository;

import com.greenfox.databaseintegration.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface Repo extends CrudRepository<ToDo, Long> {

}
