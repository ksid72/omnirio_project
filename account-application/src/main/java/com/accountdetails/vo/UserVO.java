package com.accountdetails.vo;

import java.util.Date;

public class UserVO {

	private String accountId;
	private String accountType;
	private Date openDate;
	private String UserId ;
	private String UserName;
	private String branch;
	private Character minorIndicator;
	
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String UserId) {
		UserId = UserId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String UserName) {
		this.UserName = UserName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Character getMinorIndicator() {
		return minorIndicator;
	}
	public void setMinorIndicator(Character minorIndicator) {
		this.minorIndicator = minorIndicator;
	}
	
	
}
