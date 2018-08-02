package com.greenfox.numbers.repositories;

import com.greenfox.numbers.models.Numbers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NumbersRepository extends CrudRepository<Numbers, Long> {
List<Numbers> findAll();
Numbers findOneById(Long Id);
}
