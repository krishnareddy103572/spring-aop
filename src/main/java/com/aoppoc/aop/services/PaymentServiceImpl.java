package com.aoppoc.aop.services;

public class PaymentServiceImpl implements PaymentService {

	@Override
	public void payment(int amount) {
		// TODO Auto-generated method stub
		
		System.out.println(amount+"Amount  Debited");
		System.out.println(amount+"Amount Credited");

	}

}
