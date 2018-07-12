package com.greenfox.connectwithmysql.Repository;

import com.greenfox.connectwithmysql.Model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
