package com.trax.services;

import java.util.List;

import com.trax.entities.Contact;

public interface ContactService {
	public void saveContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact findContactById(long id);

}
