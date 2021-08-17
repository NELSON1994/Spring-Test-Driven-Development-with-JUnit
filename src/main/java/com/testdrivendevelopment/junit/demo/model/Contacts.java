package com.testdrivendevelopment.junit.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="CONTACTS_TABLE")
public class Contacts {
    @Id
    @GeneratedValue
    private Long contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
