package com.dev.swag.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class MstEmployeeBo 
{
	private Long employeeId;
	
	private String employeeName;
	

	
	MstEmployeeBo()
	{
		System.out.println("object is created ");
	}
	

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	public void show()
	{
		System.out.println(" method called ");
	}
	

}
