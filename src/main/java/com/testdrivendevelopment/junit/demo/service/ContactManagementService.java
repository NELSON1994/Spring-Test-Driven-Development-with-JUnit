package com.testdrivendevelopment.junit.demo.service;

import com.testdrivendevelopment.junit.demo.model.Contacts;
import com.testdrivendevelopment.junit.demo.repository.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactManagementService {

    @Autowired
    private ContactsRepository contactsRepository;

    public Contacts addContact(Contacts contacts){
        Contacts c=new Contacts();
        if(contacts.getPhoneNumber() !=null && contacts.getFirstName() !=null && contacts.getLastName() !=null){
            c=contactsRepository.save(contacts);
        }
        return c;
    }
}
