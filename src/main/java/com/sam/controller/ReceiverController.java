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

import com.sam.model.Receiver;
import com.sam.service.ReceiverService;

/**
 * @author sunny
 *
 */
@RestController
@RequestMapping(value = "/receivers")
public class ReceiverController {
	
	@Autowired
	private ReceiverService receiverService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Receiver> getReceiverById(@PathVariable String id) {
		Receiver newPaymnet = receiverService.getReceiverById(id);
		return new ResponseEntity<>(newPaymnet, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Receiver>> getAllReceivers() {
		List<Receiver> receivers = receiverService.getAllReceivers();
		return new ResponseEntity<List<Receiver>>(receivers, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Receiver> createReceiver(@RequestBody Receiver receiver) {
		Receiver newReceiver = receiverService.createReceiver(receiver);
		return new ResponseEntity<Receiver>(newReceiver, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Receiver> updateReceiver(@PathVariable String id, @RequestBody Receiver receiver) {
		Receiver updatedReceiver = receiverService.updateReceiver(receiver);
		return new ResponseEntity<Receiver>(updatedReceiver, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteReceiver(@PathVariable String id) {
		receiverService.deleteReceiver(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
