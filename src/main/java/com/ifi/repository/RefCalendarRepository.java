/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:02:18 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.repository;

import com.ifi.entity.RefCalendar;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jpa repository for RefCalendar.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Repository
public interface RefCalendarRepository  extends JpaRepository<RefCalendar, Date> {}