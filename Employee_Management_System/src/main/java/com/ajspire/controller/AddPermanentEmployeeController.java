package com.ajspire.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ajspire.mode.Employee;
import com.ajspire.mode.PermanentEmployee;
import com.ajspire.service.EmpoyeeService;
import com.ajspire.util.Utility;


@Controller
public class AddPermanentEmployeeController {
	@Autowired
	EmpoyeeService<Employee, Integer> service;

	@RequestMapping("/addPermanentEmployee")
	public String m1() {
		return "addPermanentEmployee";
	}

	@RequestMapping(value = "/addPermanentEmployeeData",method = RequestMethod.POST)
	public String addEmployee(HttpServletRequest request,ModelMap model) {
		try {
			String EmpNo = request.getParameter("empNo");
			String empName = request.getParameter("empName");
			String sempSal = request.getParameter("empSal");
			String empDept = request.getParameter("empDept");
			String DateOfJoining = request.getParameter("empJoinDate");
			String DateOfBirth = request.getParameter("empBirthDate");
			int empNo = Integer.parseInt(EmpNo);
			float empSal = Float.parseFloat(sempSal);
			float empDa = empSal * 10.0f / 100.0f;// Da is 10% of basic salary
			float empHra = empSal * 7.5f / 100.0f;// Hra is 7.5% of Basic
			LocalDate joinDate = Utility.StringToLocalDate(DateOfJoining);
			LocalDate birthDate = Utility.StringToLocalDate(DateOfBirth);
			Employee emp = new PermanentEmployee(empNo, empName, empSal, empDept, DateOfJoining, DateOfBirth, empDa, empHra);
			service.add(emp);
			model.addAttribute("msg", "Reacord Added Successfully....");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "showMenu";

	}

}