package com.project.rentalRide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentalRide.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
