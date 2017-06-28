/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Payment;

/**
 * @author Sandeep
 */
public interface PaymentService {

	Payment getPaymentById(String id);

	List<Payment> getAllPayments();

	Payment createPayment(Payment payment);

	Payment updatePayment(Payment payment);

	void deletePayment(String id);

}
