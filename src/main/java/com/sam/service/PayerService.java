/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Payer;

/**
 * @author Sandeep
 */
public interface PayerService {

	Payer getPayerById(String id);

	List<Payer> getAllPayers();

	Payer createPayer(Payer payer);

	Payer updatePayer(Payer payer);

	void deletePayer(String id);

}
