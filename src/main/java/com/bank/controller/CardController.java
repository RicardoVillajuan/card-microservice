package com.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bank.entity.Card;
import com.bank.service.ICardService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/card")
public class CardController {
	private final ICardService cardService;

	@GetMapping
	public Flux<Card> findAll(){
		 
		return cardService.findAll();
	}
	
	@PostMapping
	public Mono<Card> save(@RequestBody Card card){
		return cardService.create(card);
	}
			
	@PutMapping("/{idcard}")
	public Mono<Card> update(@RequestBody Card card,@PathVariable String idcard){
		
		return cardService.update(idcard, card);
	}
}
