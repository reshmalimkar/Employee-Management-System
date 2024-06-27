package com.ajspire.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ajspire.mode.Employee;
import com.ajspire.service.EmpoyeeServiceImpl;

@Controller
public class SearchEmployeeController {
	@RequestMapping("searchEmployee")
	public String search() {
		return "searchEmployee";

	}
	@Autowired
	EmpoyeeServiceImpl  empservice;
	@RequestMapping(value="searchEmployeeData")
	public String searchEmp(ModelMap model, HttpServletRequest request,HttpServletResponse response) {
		String EmpNo = request.getParameter("empNo");
		int empNo=Integer.parseInt(EmpNo);
		Employee emp=null;
		try {
			emp=empservice.getById(empNo);
			model.addAttribute("employee", emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "showEmployee";
		
	}
	
	

}
