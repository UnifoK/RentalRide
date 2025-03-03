package com.project.rentalRide.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.rentalRide.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
