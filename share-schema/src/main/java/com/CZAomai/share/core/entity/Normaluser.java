package com.CZAomai.share.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "am_normaluser")
public class Normaluser extends IdEntity {
	
	private String userName;
	private String userRealName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	
	
}
