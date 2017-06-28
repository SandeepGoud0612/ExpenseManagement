/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.model.Payment;
import com.sam.repository.PaymentRepository;

/**
 * @author Sandeep
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository paymentRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentService#getPaymentById(java.lang.String)
	 */
	@Override
	public Payment getPaymentById(String id) {
		return paymentRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentService#getAllPayments()
	 */
	@Override
	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentService#createPayment(com.sam.model.Payment)
	 */
	@Override
	public Payment createPayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentService#updatePayment(com.sam.model.Payment)
	 */
	@Override
	public Payment updatePayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentService#deletePayment(java.lang.String)
	 */
	@Override
	public void deletePayment(String id) {
		paymentRepository.delete(id);
	}

}
