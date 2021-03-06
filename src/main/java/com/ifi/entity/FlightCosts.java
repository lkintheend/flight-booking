/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:02:17 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Persistent class for FlightCosts entity stored in table flight_costs.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Entity
@Table(name="flight_costs", catalog="flight_booking" )
public class FlightCosts implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="flight_number", nullable=false)
    private Integer flightNumber ; // Foreign Key 
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="aircraft_type_code")
    private Integer aircraftTypeCode ;     @Temporal(TemporalType.TIMESTAMP)
    @Column(name="valid_from_date")
    private Date validFromDate ;     @Temporal(TemporalType.TIMESTAMP)
    @Column(name="valid_to_date")
    private Date validToDate ; // Foreign Key     @Column(name="flight_cost")
    private Integer flightCost ; 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public FlightCosts() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber ;
    }
	public Integer getFlightNumber() {
        return this.flightNumber;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : aircraft_type_code (INT) 
	public void setAircraftTypeCode(Integer aircraftTypeCode) {this.aircraftTypeCode = aircraftTypeCode;}
	public Integer getAircraftTypeCode() {return this.aircraftTypeCode;}

	//--- DATABASE MAPPING : valid_from_date (DATETIME) 
	public void setValidFromDate(Date validFromDate) {this.validFromDate = validFromDate;}
	public Date getValidFromDate() {return this.validFromDate;}

	//--- DATABASE MAPPING : valid_to_date (DATETIME) 
	public void setValidToDate(Date validToDate) {this.validToDate = validToDate;}
	public Date getValidToDate() {return this.validToDate;}

	//--- DATABASE MAPPING : flight_cost (INT) 
	public void setFlightCost(Integer flightCost) {this.flightCost = flightCost;}
	public Integer getFlightCost() {return this.flightCost;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(flightNumber); 
		sb.append(aircraftTypeCode); 
		sb.append("|"); 
		sb.append(validFromDate); 
		sb.append("|"); 
		sb.append(validToDate); 
		sb.append("|"); 
		sb.append(flightCost); 
        return sb.toString();
    }
}