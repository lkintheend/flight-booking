/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:02:17 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Composite primary key for entity "LtineraryLegs" ( stored in table "ltinerary_legs" )
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
 @Embeddable
public class LtineraryLegsKey implements Serializable {
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="reservation_id", nullable=false)
    private Integer reservationId ;
    @Column(name="leg_id", nullable=false)
    private Integer legId ;

    //----------------------------------------------------------------------
    // CONSTRUCTORS
    //----------------------------------------------------------------------
    public LtineraryLegsKey() {
        super();
    }

    public LtineraryLegsKey(Integer reservationId, Integer legId) {
        super();
        this.reservationId = reservationId ;
        this.legId = legId ;
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
	public void setReservationId(Integer value) {
        this.reservationId = value;
    }
	public Integer getReservationId() {
        return this.reservationId;
    }

	public void setLegId(Integer value) {
        this.legId = value;
    }
	public Integer getLegId() {
        return this.legId;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(reservationId); 
		sb.append("|"); 
		sb.append(legId); 
        return sb.toString();
    }
}