/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Bill;

/**
 * @author Sandeep
 */
public interface BillService {

	Bill getBillById(String id);

	List<Bill> getAllBills();

	Bill createBill(Bill bill);

	Bill updateBill(Bill bill);

	void deleteBill(String id);

}
