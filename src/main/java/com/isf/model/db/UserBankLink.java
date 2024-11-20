package com.isf.model.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserBankLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ublId;

    private Long usId;
    private String usAccname;
    private Integer bkId;
    private boolean ublActive;
    private String ublModdt;
	public Integer getUblId() {
		return ublId;
	}
	public void setUblId(Integer ublId) {
		this.ublId = ublId;
	}
	public Long getUsId() {
		return usId;
	}
	public void setUsId(Long usId) {
		this.usId = usId;
	}
	public String getUsAccname() {
		return usAccname;
	}
	public void setUsAccname(String usAccname) {
		this.usAccname = usAccname;
	}
	public Integer getBkId() {
		return bkId;
	}
	public void setBkId(Integer bkId) {
		this.bkId = bkId;
	}
	public boolean isUblActive() {
		return ublActive;
	}
	public void setUblActive(boolean ublActive) {
		this.ublActive = ublActive;
	}
	public String getUblModdt() {
		return ublModdt;
	}
	public void setUblModdt(String ublModdt) {
		this.ublModdt = ublModdt;
	}

    
}
