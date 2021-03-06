/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:02:18 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Persistent class for Payments entity stored in table payments.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Entity
@Table(name="payments", catalog="flight_booking" )
public class Payments implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="payment_id", nullable=false)
    private Integer paymentId ; 
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="payment_status_code")
    private Integer paymentStatusCode ;     @Temporal(TemporalType.TIMESTAMP)
    @Column(name="payment_date")
    private Date paymentDate ;     @Column(name="payment_amount", length=255)
    private String paymentAmount ; 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Payments() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId ;
    }
	public Integer getPaymentId() {
        return this.paymentId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : payment_status_code (INT) 
	public void setPaymentStatusCode(Integer paymentStatusCode) {this.paymentStatusCode = paymentStatusCode;}
	public Integer getPaymentStatusCode() {return this.paymentStatusCode;}

	//--- DATABASE MAPPING : payment_date (DATETIME) 
	public void setPaymentDate(Date paymentDate) {this.paymentDate = paymentDate;}
	public Date getPaymentDate() {return this.paymentDate;}

	//--- DATABASE MAPPING : payment_amount (VARCHAR) 
	public void setPaymentAmount(String paymentAmount) {this.paymentAmount = paymentAmount;}
	public String getPaymentAmount() {return this.paymentAmount;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(paymentId); 
		sb.append(paymentStatusCode); 
		sb.append("|"); 
		sb.append(paymentDate); 
		sb.append("|"); 
		sb.append(paymentAmount); 
        return sb.toString();
    }
}