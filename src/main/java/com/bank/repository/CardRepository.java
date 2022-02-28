package com.bank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bank.entity.Card;

public interface CardRepository extends ReactiveMongoRepository<Card, String>{

}
