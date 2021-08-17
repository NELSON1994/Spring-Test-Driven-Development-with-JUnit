package com.testdrivendevelopment.junit.demo.service;

import com.testdrivendevelopment.junit.demo.controller.ContactsController;
import com.testdrivendevelopment.junit.demo.model.Contacts;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;


//@RunWith(MockitoJUnitRunner.class)// instruct app to run mockito test class
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)// FOR EVERY WEB ENVIRONMENT
public class IntegrationTestForTheController {

    @Autowired
    private ContactsController contactsController;

    @Test
    public void testAddContactHappyPath(){
        // create contact
        Contacts contacts=new Contacts();
        contacts.setFirstName("Victor");
        contacts.setLastName("Moses");
        contacts.setPhoneNumber("0718826344");

        // POST our contacts for the controller
        Contacts contacts1=contactsController.createContact(contacts);

        //Assert THAT the outcome is as expected
       // assertThat(contacts1.getFirstName(), is(equalTo("Nelson")));
        assertNotNull(contacts1.getContactId());
        assertEquals(contacts1.getFirstName(),contacts.getFirstName());
        assertSame(contacts,contacts1);
    }

}
