package com.project.rentalRide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentalRide.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
