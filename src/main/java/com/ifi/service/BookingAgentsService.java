/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:02:17 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;

import com.ifi.entity.BookingAgents;
import java.util.List;

public interface BookingAgentsService {

	public BookingAgents getOne(Integer agentId);

	public List<BookingAgents> findAll();

	public Boolean delete(Integer agentId);

	public BookingAgents create(BookingAgents bookingAgents);

	public BookingAgents update(BookingAgents bookingAgents);

	public Boolean exist(BookingAgents bookingAgents);
}
