package com.isf.model.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usId;

    private String usEmail;
    private String usPwd;
    private String usName;
    private String usDob;
    private String usGender;
    private String usMobile;
	public Long getUsId() {
		return usId;
	}
	public void setUsId(Long usId) {
		this.usId = usId;
	}
	public String getUsEmail() {
		return usEmail;
	}
	public void setUsEmail(String usEmail) {
		this.usEmail = usEmail;
	}
	public String getUsPwd() {
		return usPwd;
	}
	public void setUsPwd(String usPwd) {
		this.usPwd = usPwd;
	}
	public String getUsName() {
		return usName;
	}
	public void setUsName(String usName) {
		this.usName = usName;
	}
	public String getUsDob() {
		return usDob;
	}
	public void setUsDob(String usDob) {
		this.usDob = usDob;
	}
	public String getUsGender() {
		return usGender;
	}
	public void setUsGender(String usGender) {
		this.usGender = usGender;
	}
	public String getUsMobile() {
		return usMobile;
	}
	public void setUsMobile(String usMobile) {
		this.usMobile = usMobile;
	}

    
}
