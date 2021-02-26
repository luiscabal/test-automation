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
public class DocumentTypeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@NotNull
	private Integer dotyId;
	@NotNull
	@NotEmpty
	@Size(max = 1)
	private String enable;
	@NotNull
	@NotEmpty
	@Size(max = 255)
	private String name;
	public Integer getDotyId() {
		return dotyId;
	}
	public void setDotyId(Integer dotyId) {
		this.dotyId = dotyId;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
