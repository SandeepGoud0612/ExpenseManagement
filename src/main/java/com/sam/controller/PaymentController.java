/**
 * This source code is property of Sandeep.
 */
package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sam.model.Payment;
import com.sam.service.PaymentService;

/**
 * @author Sandeep
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Payment> getPaymentById(@PathVariable String id) {
		Payment newPaymnet = paymentService.getPaymentById(id);
		return new ResponseEntity<>(newPaymnet, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Payment>> getAllPayments() {
		List<Payment> payments = paymentService.getAllPayments();
		return new ResponseEntity<List<Payment>>(payments, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
		Payment newPayment = paymentService.createPayment(payment);
		return new ResponseEntity<Payment>(newPayment, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Payment> updatePayment(@PathVariable String id, @RequestBody Payment payment) {
		Payment updatedPayment = paymentService.updatePayment(payment);
		return new ResponseEntity<Payment>(updatedPayment, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletePayment(@PathVariable String id) {
		paymentService.deletePayment(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
