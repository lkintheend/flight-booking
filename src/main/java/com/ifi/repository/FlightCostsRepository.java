/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:02:17 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.repository;

import com.ifi.entity.FlightCosts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jpa repository for FlightCosts.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Repository
public interface FlightCostsRepository  extends JpaRepository<FlightCosts, Integer> {}