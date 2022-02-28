package com.bank.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Card {

	@Id
	private String id;
	private String cardnumber;
	private String cvc;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime expirationdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime creationdate;
	private String idaccount;
}
