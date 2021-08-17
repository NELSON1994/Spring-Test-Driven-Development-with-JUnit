package com.testdrivendevelopment.junit.demo.service;

import com.testdrivendevelopment.junit.demo.controller.ContactsController;
import com.testdrivendevelopment.junit.demo.model.Contacts;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.http.RequestEntity.post;
import static org.springframework.http.ResponseEntity.status;


//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)// FOR EVERY WEB ENVIRONMENT
@WebMvcTest(ContactsController.class)
public class UnitTestForTheController {

    //mimic/mock web browser behaviour
    //Load @Controller
    //Load mocks for @Service and beyond
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContactManagementService contactManagementService;

    @InjectMocks
    private ContactsController contactsController;

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddContactHappyPath() throws Exception {
        Contacts contacts=new Contacts();
    contacts.setLastName("nnsnnsns");
    contacts.setPhoneNumber("09888999889");
    contacts.setFirstName("ghdydhdhdyh");
            mockMvc
                    .perform((RequestBuilder) post("/create", contacts))
                    .andExpect(status(200)).andReturn();

    }

}
