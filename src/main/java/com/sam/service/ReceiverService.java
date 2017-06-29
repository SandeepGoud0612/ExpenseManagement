/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Receiver;

/**
 * @author Sandeep
 */
public interface ReceiverService {

	Receiver getReceiverById(String id);

	List<Receiver> getAllReceivers();

	Receiver createReceiver(Receiver receiver);

	Receiver updateReceiver(Receiver receiver);

	void deleteReceiver(String id);

}
