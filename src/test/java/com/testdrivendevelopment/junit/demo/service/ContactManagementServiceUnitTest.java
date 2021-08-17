package com.testdrivendevelopment.junit.demo.service;

import com.testdrivendevelopment.junit.demo.model.Contacts;
import com.testdrivendevelopment.junit.demo.repository.ContactsRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

//@RunWith(MockitoJUnitRunner.class)// instruct app to run mockito test class
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)// no controllers will be loaded
public class ContactManagementServiceUnitTest {
    //unit testing
    //- Not load @Controller
    //-load mocks for @Service and its dependencies
    //-Use Mockito for our mocking framework

    @InjectMocks
    private ContactManagementService contactManagementService;

    @Mock
    private ContactsRepository contactsRepository;

    @Before
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddContactHappyPath(){
        // create contact
        Contacts contacts=new Contacts();
        contacts.setFirstName("Nelson");
        contacts.setLastName("Moses");
        contacts.setPhoneNumber("0718826344");
        //when a contactRepository receives a call on its save() for any Contact class,it returs the mocked content(Contact)
        when(contactsRepository.save(any(Contacts.class))).thenReturn(contacts);
        // save the contact
        Contacts contacts1=contactManagementService.addContact(contacts);
        // verify the addition the save
        assertEquals("Nelson",contacts1.getFirstName());

    }

}
