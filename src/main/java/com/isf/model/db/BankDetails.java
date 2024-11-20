package com.isf.model.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BankDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bkId;

    private String bkName;
    private String bkAccountNumber;
    private String bkIfsc;
    private String bkModdt;
    
	public Integer getBkId() {
		return bkId;
	}
	public void setBkId(Integer bkId) {
		this.bkId = bkId;
	}
	public String getBkName() {
		return bkName;
	}
	public void setBkName(String bkName) {
		this.bkName = bkName;
	}
	public String getBkAccountNumber() {
		return bkAccountNumber;
	}
	public void setBkAccountNumber(String bkAccountNumber) {
		this.bkAccountNumber = bkAccountNumber;
	}
	public String getBkIfsc() {
		return bkIfsc;
	}
	public void setBkIfsc(String bkIfsc) {
		this.bkIfsc = bkIfsc;
	}
	public String getBkModdt() {
		return bkModdt;
	}
	public void setBkModdt(String bkModdt) {
		this.bkModdt = bkModdt;
	}
    
	
    
}
