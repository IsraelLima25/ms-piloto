package com.devlima.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.devlima.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workeriD, int days) {
		return new Payment("Bob", 200.0, days);
	}
	
}
