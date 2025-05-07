package com.rabelo.manoel.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.rabelo.manoel.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long WorkerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
