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

import com.sam.model.Bill;
import com.sam.service.BillService;

/**
 * @author sunny
 *
 */
@RestController
@RequestMapping(value = "/bills")
public class BillController {

	@Autowired
	private BillService billService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bill> getBillById(@PathVariable String id) {
		Bill newBill = billService.getBillById(id);
		return new ResponseEntity<Bill>(newBill, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Bill>> getAllBills() {
		List<Bill> bills = billService.getAllBills();
		return new ResponseEntity<>(bills, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bill> createBill(@RequestBody Bill bill) {
		Bill newBill = billService.createBill(bill);
		return new ResponseEntity<Bill>(newBill, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bill> updateBill(@RequestBody Bill bill) {
		Bill updateBill = billService.updateBill(bill);
		return new ResponseEntity<Bill>(updateBill, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteBill(@PathVariable String id) {
		billService.deleteBill(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
