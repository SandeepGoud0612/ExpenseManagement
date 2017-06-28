/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.model.Expense;
import com.sam.repository.ExpenseRepository;

/**
 * @author Sandeep
 */
@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ExpenseService#getExpenseById(com.sam.model.Expense)
	 */
	@Override
	public Expense getExpenseById(String id) {
		return expenseRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ExpenseService#getAllExpenses()
	 */
	@Override
	public List<Expense> getAllExpenses() {
		return expenseRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ExpenseService#createExpense(com.sam.model.Expense)
	 */
	@Override
	public Expense createExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ExpenseService#updateExpense(com.sam.model.Expense)
	 */
	@Override
	public Expense updateExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ExpenseService#deleteExpense(java.lang.String)
	 */
	@Override
	public void deleteExpense(String id) {
		expenseRepository.delete(id);
	}

}
