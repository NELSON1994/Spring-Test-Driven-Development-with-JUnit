package com.testdrivendevelopment.junit.demo.controller;

import com.testdrivendevelopment.junit.demo.model.Contacts;
import com.testdrivendevelopment.junit.demo.service.ContactManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

    @Autowired
    private ContactManagementService contactManagementService;

    @PostMapping("/create")
    public Contacts createContact(@RequestBody Contacts c){
        return contactManagementService.addContact(c);
    }
}
