/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Expense;

/**
 * @author Sandeep
 */
public interface ExpenseService {

	Expense getExpenseById(String id);

	List<Expense> getAllExpenses();

	Expense createExpense(Expense expense);

	Expense updateExpense(Expense expense);

	void deleteExpense(String id);

}
