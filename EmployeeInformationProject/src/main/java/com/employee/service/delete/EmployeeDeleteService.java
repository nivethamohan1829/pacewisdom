package com.employee.service.delete;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface EmployeeDeleteService {
	
	EmployeeDeleteResponse deleteEmployee(EmployeeDeleteRequest id,HttpServletRequest request, HttpSession session);

}
