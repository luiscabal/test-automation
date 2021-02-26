package com.vobi.devops.bank.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 *
 */
public class RegisteredAccountDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@NotNull
	@NotEmpty
	@Size(max = 1)
	private String enable;
	@NotNull
	private Integer reacId;
	private String accoId_Account;
	private Integer custId_Customer;
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public Integer getReacId() {
		return reacId;
	}
	public void setReacId(Integer reacId) {
		this.reacId = reacId;
	}
	public String getAccoId_Account() {
		return accoId_Account;
	}
	public void setAccoId_Account(String accoId_Account) {
		this.accoId_Account = accoId_Account;
	}
	public Integer getCustId_Customer() {
		return custId_Customer;
	}
	public void setCustId_Customer(Integer custId_Customer) {
		this.custId_Customer = custId_Customer;
	}
	
	
}
