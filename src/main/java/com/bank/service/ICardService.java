package com.bank.service;

import com.bank.entity.Card;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICardService {
	
	Flux<Card> findAll();
	
	Mono<Card> create(Card card);
	
	Mono<Card> update(String id,Card card);

	Mono<Card> findById(String id);
}
