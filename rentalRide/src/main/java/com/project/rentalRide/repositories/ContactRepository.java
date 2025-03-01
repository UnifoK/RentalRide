package com.project.rentalRide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentalRide.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
