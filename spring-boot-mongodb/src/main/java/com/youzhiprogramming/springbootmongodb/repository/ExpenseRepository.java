package com.youzhiprogramming.springbootmongodb.repository;
import com.youzhiprogramming.springbootmongodb.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ExpenseRepository extends MongoRepository<Expense, String>{
}
