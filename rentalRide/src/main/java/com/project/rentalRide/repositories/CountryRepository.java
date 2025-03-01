package com.project.rentalRide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentalRide.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
