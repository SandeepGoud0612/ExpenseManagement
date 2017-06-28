/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.model.Payer;
import com.sam.repository.PayerRepository;

/**
 * @author Sandeep
 */
@Service
public class PayerServiceImpl implements PayerService {

	@Autowired
	private PayerRepository payerRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PayerService#getPayerById(java.lang.String)
	 */
	@Override
	public Payer getPayerById(String id) {
		return payerRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PayerService#getAllPayers()
	 */
	@Override
	public List<Payer> getAllPayers() {
		return payerRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PayerService#createPayer(com.sam.model.Payer)
	 */
	@Override
	public Payer createPayer(Payer payer) {
		return payerRepository.save(payer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PayerService#updatePayer(com.sam.model.Payer)
	 */
	@Override
	public Payer updatePayer(Payer payer) {
		return payerRepository.save(payer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PayerService#deletePayer(java.lang.String)
	 */
	@Override
	public void deletePayer(String id) {
		payerRepository.delete(id);
	}

}
