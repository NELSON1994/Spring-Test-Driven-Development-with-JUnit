package com.testdrivendevelopment.junit.demo.service;

import com.testdrivendevelopment.junit.demo.model.Contacts;
import com.testdrivendevelopment.junit.demo.repository.ContactsRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)// instruct app to run spring boot test class
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)// no controllers will be loaded
public class ContactManagementServiceIntegrationTest {

    @Autowired
    private ContactManagementService contactManagementService;

    @Autowired
    private ContactsRepository contactsRepository;

    // INTEGRATION TEST
    @Test
    public void testAddContactHappyPath(){

        // create contact
        Contacts contacts=new Contacts();
        contacts.setFirstName("Nelson");
        contacts.setLastName("Moses");
        contacts.setPhoneNumber("0718826344");

        // save the contact
        Contacts c=contactManagementService.addContact(contacts);

        // verify the addition  by JUNIT
        assertNotNull(c); // check if the new contact is not null, i.e Smoke Test
        assertNotNull(c.getContactId());
        assertEquals("Nelson",c.getFirstName()); // just a simple comparison

    }
}
