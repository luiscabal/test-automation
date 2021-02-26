package com.vobi.devops.bank.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 *
 */
public class TransactionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@NotNull
	private Double amount;
	@NotNull
	private Date date;
	@NotNull
	private Integer tranId;
	private String accoId_Account;
	private Integer trtyId_TransactionType;
	private String userEmail_Users;
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getAccoId_Account() {
		return accoId_Account;
	}
	public void setAccoId_Account(String accoId_Account) {
		this.accoId_Account = accoId_Account;
	}
	public Integer getTrtyId_TransactionType() {
		return trtyId_TransactionType;
	}
	public void setTrtyId_TransactionType(Integer trtyId_TransactionType) {
		this.trtyId_TransactionType = trtyId_TransactionType;
	}
	public String getUserEmail_Users() {
		return userEmail_Users;
	}
	public void setUserEmail_Users(String userEmail_Users) {
		this.userEmail_Users = userEmail_Users;
	}
	
	
}
