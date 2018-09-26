/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:02:17 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;

import com.ifi.entity.FlightSchedules;
import java.util.List;

public interface FlightSchedulesService {

	public FlightSchedules getOne(Integer flightNumber);

	public List<FlightSchedules> findAll();

	public Boolean delete(Integer flightNumber);

	public FlightSchedules create(FlightSchedules flightSchedules);

	public FlightSchedules update(FlightSchedules flightSchedules);

	public Boolean exist(FlightSchedules flightSchedules);
}