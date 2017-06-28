/**
 * This source code is property of Sandeep.
 */
package com.sam.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sandeep
 */
@Document(collection = "payers")
public class Payer implements Serializable {

	private static final long serialVersionUID = 6123028277899644652L;

	@Id
	private String id;

	private Person person;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
