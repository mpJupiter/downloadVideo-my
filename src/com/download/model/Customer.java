package com.download.model;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Customer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_customer"
    ,catalog="downloadvideo"
)

public class Customer  implements java.io.Serializable {


    // Fields    

     private Integer customerId;
     private String customerName;
     private String password;


    // Constructors

    /** default constructor */
    public Customer() {
    }

	/** minimal constructor */
    public Customer(Integer customerId) {
        this.customerId = customerId;
    }
    
    /** full constructor */
    public Customer(Integer customerId, String customerName, String password) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="customerId", unique=true, nullable=false)

    public Integer getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    
    @Column(name="customerName", length=11)

    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    @Column(name="password", length=11)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
   








}