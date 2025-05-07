package com.rabelo.manoel.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabelo.manoel.hrpayroll.entities.Payment;
import com.rabelo.manoel.hrpayroll.entities.Worker;
import com.rabelo.manoel.hrpayroll.feignclients.WorkerFeingClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeingClient workerFeingClient;

	public Payment getPayment(long workerId, int days) {
		Worker worker = workerFeingClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
