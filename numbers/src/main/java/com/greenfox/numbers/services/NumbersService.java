package com.greenfox.numbers.services;

import com.greenfox.numbers.models.Numbers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NumbersService {
  Integer sum(Numbers numbers);

  Integer[] squares(Numbers numbers);

  List<Numbers> numbersList();

  String saveNumbers(Numbers numbers);

  Numbers validateAndConvert(String inputNumbers[]);

  Numbers findById(Long id);

}