package com.employee.service.find;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EmployeeFindRequest {
	
	@NotNull(message = "email id can't be null")
	@NotEmpty(message = "email id can't be empty")
	@Column(name = "id")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
