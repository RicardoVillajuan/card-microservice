package com.bank.servicedb;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.bank.entity.Card;
import com.bank.repository.CardRepository;
import com.bank.service.ICardService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CardServicedb implements ICardService{
	
	private final CardRepository repoCard;
	
	@Override
	public Flux<Card> findAll() {
		// TODO Auto-generated method stub
		return repoCard.findAll();
	}

	@Override
	public Mono<Card> create(Card card) {
		// TODO Auto-generated method stub
		card.setCreationdate(LocalDateTime.now());
		card.setExpirationdate(LocalDateTime.now().plusYears(5));
		return repoCard.save(card);
	}

	@Override
	public Mono<Card> update(String id, Card card) {
		// TODO Auto-generated method stub
		return repoCard.findById(id)
				.flatMap(e->{
					card.setId(e.getId());
					return repoCard.save(card);
				});
	}

	@Override
	public Mono<Card> findById(String id) {
		// TODO Auto-generated method stub
		return repoCard.findById(id);
	}

	
}
