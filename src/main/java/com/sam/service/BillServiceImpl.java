/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.model.Bill;
import com.sam.repository.BillRepository;

/**
 * @author Sandeep
 */
@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepository billRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BillService#getBillById(java.lang.String)
	 */
	@Override
	public Bill getBillById(String id) {
		return billRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BillService#getAllBills()
	 */
	@Override
	public List<Bill> getAllBills() {
		return billRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BillService#createBill(com.sam.model.Bill)
	 */
	@Override
	public Bill createBill(Bill bill) {
		return billRepository.save(bill);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BillService#updateBill(com.sam.model.Bill)
	 */
	@Override
	public Bill updateBill(Bill bill) {
		return billRepository.save(bill);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BillService#deleteBill(java.lang.String)
	 */
	@Override
	public void deleteBill(String id) {
		billRepository.delete(id);
	}

}
