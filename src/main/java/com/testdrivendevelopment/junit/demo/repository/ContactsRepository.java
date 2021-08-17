package com.testdrivendevelopment.junit.demo.repository;

import com.testdrivendevelopment.junit.demo.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts,Long> {
}
