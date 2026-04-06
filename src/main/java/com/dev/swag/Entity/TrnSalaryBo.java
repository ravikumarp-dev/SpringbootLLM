package com.dev.swag.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrnSalaryBo {
	
	private int salaryId;
	private long amount;
	
	@Autowired
	private MstEmployeeBo mstEmployeeBo;
	
	public int getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public MstEmployeeBo getMstEmployeeBo() {
		return mstEmployeeBo;
	}
	public void setMstEmployeeBo(MstEmployeeBo mstEmployeeBo) {
		this.mstEmployeeBo = mstEmployeeBo;
	}
	
	

}
