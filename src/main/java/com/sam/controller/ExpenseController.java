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

import com.sam.model.Expense;
import com.sam.service.ExpenseService;

/**
 * @author sunny
 *
 */
@RestController
@RequestMapping(value = "/expenses")
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Expense> getExpenseById(@PathVariable String id) {
		Expense newPaymnet = expenseService.getExpenseById(id);
		return new ResponseEntity<>(newPaymnet, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Expense>> getAllExpenses() {
		List<Expense> expenses = expenseService.getAllExpenses();
		return new ResponseEntity<List<Expense>>(expenses, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Expense> createExpense(@RequestBody Expense expense) {
		Expense newExpense = expenseService.createExpense(expense);
		return new ResponseEntity<Expense>(newExpense, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Expense> updateExpense(@PathVariable String id, @RequestBody Expense expense) {
		Expense updatedExpense = expenseService.updateExpense(expense);
		return new ResponseEntity<Expense>(updatedExpense, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteExpense(@PathVariable String id) {
		expenseService.deleteExpense(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
