package com.example.demo.user;

import java.util.Date;

import com.example.demo.Model;


public class User extends Model {
	
	public User() {
		super();		
	}
	public User(Integer id) {
		super();
		this.bwUserID = id;
	}
    
	private Integer bwUserID;
    
    private String bwUserFirstName;
    
    private String bwUserLastName;
    
    private String bwUserEmail;
    
    private String bwUserMobilePhone;
    
    private String bwUserPwd;
    
    private Boolean bwUserActive;
    
    private Date bwUserCreateDate;
    
    private Date bwUserModifiedDate;
    
    private Integer bwBarnID;
    
    private Integer bwUserTypeID;

    
	public Integer getBwUserID() {
		return bwUserID;
	}

	public void setBwUserID(Integer bwUserID) {
		this.bwUserID = bwUserID;
	}

	public String getBwUserFirstName() {
		return bwUserFirstName;
	}

	public void setBwUserFirstName(String bwUserFirstName) {
		this.bwUserFirstName = bwUserFirstName;
	}

	public String getBwUserLastName() {
		return bwUserLastName;
	}

	public void setBwUserLastName(String bwUserLastName) {
		this.bwUserLastName = bwUserLastName;
	}

	public String getBwUserEmail() {
		return bwUserEmail;
	}

	public void setBwUserEmail(String bwUserEmail) {
		this.bwUserEmail = bwUserEmail;
	}

	public String getBwUserMobilePhone() {
		return bwUserMobilePhone;
	}

	public void setBwUserMobilePhone(String bwUserMobilePhone) {
		this.bwUserMobilePhone = bwUserMobilePhone;
	}

	public String getBwUserPwd() {
		return bwUserPwd;
	}

	public void setBwUserPwd(String bwUserPwd) {
		this.bwUserPwd = bwUserPwd;
	}

	public Boolean getBwUserActive() {
		return bwUserActive;
	}

	public void setBwUserActive(Boolean bwUserActive) {
		this.bwUserActive = bwUserActive;
	}

	public Date getBwUserCreateDate() {
		return bwUserCreateDate;
	}

	public void setBwUserCreateDate(Date bwUserCreateDate) {
		this.bwUserCreateDate = bwUserCreateDate;
	}

	public Date getBwUserModifiedDate() {
		return bwUserModifiedDate;
	}

	public void setBwUserModifiedDate(Date bwUserModifiedDate) {
		this.bwUserModifiedDate = bwUserModifiedDate;
	}

	public Integer getBwBarnID() {
		return bwBarnID;
	}

	public void setBwBarnID(Integer bwBarnID) {
		this.bwBarnID = bwBarnID;
	}

	public Integer getBwUserTypeID() {
		return bwUserTypeID;
	}

	public void setBwUserTypeID(Integer bwUserTypeID) {
		this.bwUserTypeID = bwUserTypeID;
	}
}
