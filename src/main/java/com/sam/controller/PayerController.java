/**
 * 
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

import com.sam.model.Payer;
import com.sam.service.PayerService;

/**
 * @author sunny
 *
 */
@RestController
@RequestMapping(value = "/payers")
public class PayerController {

	@Autowired
	private PayerService payerService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Payer> getPayerById(@PathVariable String id) {
		Payer newPaymnet = payerService.getPayerById(id);
		return new ResponseEntity<>(newPaymnet, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Payer>> getAllPayers() {
		List<Payer> payers = payerService.getAllPayers();
		return new ResponseEntity<List<Payer>>(payers, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Payer> createPayer(@RequestBody Payer payer) {
		Payer newPayer = payerService.createPayer(payer);
		return new ResponseEntity<Payer>(newPayer, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Payer> updatePayer(@PathVariable String id, @RequestBody Payer payer) {
		Payer updatedPayer = payerService.updatePayer(payer);
		return new ResponseEntity<Payer>(updatedPayer, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletePayer(@PathVariable String id) {
		payerService.deletePayer(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
