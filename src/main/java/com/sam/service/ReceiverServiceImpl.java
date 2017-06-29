/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.model.Receiver;
import com.sam.repository.ReceiverRepository;

/**
 * @author Sandeep
 */
@Service
public class ReceiverServiceImpl implements ReceiverService {

	@Autowired
	private ReceiverRepository receiverRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ReceiverService#getReceiverById(java.lang.String)
	 */
	@Override
	public Receiver getReceiverById(String id) {
		return receiverRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ReceiverService#getAllReceiver()
	 */
	@Override
	public List<Receiver> getAllReceivers() {
		return receiverRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sam.service.ReceiverService#createReceiver(com.sam.model.Receiver)
	 */
	@Override
	public Receiver createReceiver(Receiver receiver) {
		return receiverRepository.save(receiver);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sam.service.ReceiverService#updateReceiver(com.sam.model.Receiver)
	 */
	@Override
	public Receiver updateReceiver(Receiver receiver) {
		return receiverRepository.save(receiver);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ReceiverService#deleteReceiver(java.lang.String)
	 */
	@Override
	public void deleteReceiver(String id) {
		receiverRepository.delete(id);
	}

}
