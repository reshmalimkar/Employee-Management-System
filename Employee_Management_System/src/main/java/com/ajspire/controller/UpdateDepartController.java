package com.ajspire.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ajspire.service.EmpoyeeService;

@Controller
public class UpdateDepartController {

	@Autowired
	private EmpoyeeService service;

	@RequestMapping("/updateDeptMentDet")
	public String updateSalary() {
		return "updateDept";
	}

	@PostMapping(value = "/updateDept")
	public String updateSalaryDetails(HttpServletRequest request, HttpServletResponse response) {
		boolean success = false;
		String EmpNo = request.getParameter("empNo");
		int empNo = Integer.parseInt(EmpNo);
		String newDept = request.getParameter("empDept");
		try {
			success = service.updateById(empNo, "department", newDept);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (success) {
			return "success";
		} else {
			return "fail";
		}

	}

}
