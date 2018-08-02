package com.greenfox.numbers.services;

import com.greenfox.numbers.models.Numbers;
import com.greenfox.numbers.repositories.NumbersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumbersServiceImpl implements NumbersService {

  @Autowired
  NumbersRepository numbersRepository;

  @Override
  public Numbers validateAndConvert(String inputNumbers[]) {

    Integer[] numbers = new Integer[inputNumbers.length];

    try {
    for (int i = 0; i < inputNumbers.length; i++) {
      numbers[i] = Integer.parseInt(inputNumbers[i]);
    }
    } catch (Exception e){
      return null;
    }
    return new Numbers (numbers);
  }


  @Override
  public Integer sum(Numbers numbers) {
    Integer sum = 0;
    for (int number : numbers.getNumbers()){
      sum += number;
    }
    return sum;
  }

  @Override
  public Integer[] squares(Numbers numbers) {
    Integer[] numbersOf = numbers.getNumbers();
    Integer[] squares = new Integer[numbersOf.length];
    for (int i = 0; i <numbersOf.length; i++) {
      squares[i] = numbersOf[i] * numbersOf[i];
    }
    return squares;
  }

  @Override
  public List<Numbers> numbersList() {
    return numbersRepository.findAll();
  }

  @Override
  public Numbers findById(Long id) {
    return numbersRepository.findOneById(id);
  }

  @Override
  public String saveNumbers(Numbers numbers) {

    String message = "Numbers are correct and saved.";

    if (numbers != null){
      numbersRepository.save(numbers);
    } else {
      message = "Numbers aren't correct and  not saved.";
    }
    return message;
  }
}
