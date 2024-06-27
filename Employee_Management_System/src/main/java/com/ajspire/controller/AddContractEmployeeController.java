package com.ajspire.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ajspire.mode.ContractEmployee;
import com.ajspire.mode.Employee;
import com.ajspire.service.EmpoyeeService;
import com.ajspire.util.Utility;


@Controller
public class AddContractEmployeeController {
	
	@Autowired
	EmpoyeeService<Employee, Integer> service;

	@RequestMapping(value = "/addContractEmployee")
	public String addCont(ModelMap model) {
		model.addAttribute("employeeObj", new  Employee());
		return "addContractEmployee";

	}

	
	@RequestMapping(value="/addContractEmployeeData", method = RequestMethod.POST)
	public String addContEmployee(@ModelAttribute("employeeObj") Employee employee, ModelMap model) {
		try {
			float empIncentives = employee.getEmpSal() * 11.75f / 100.0f;
			Employee emp = new ContractEmployee(employee.getEmpNO(), employee.getEmpName(), employee.getEmpSal(), employee.getDepartment(), employee.getDateofJoining(), employee.getDateofBirth(), employee.getContractPeriod(),
					empIncentives, employee.getContractor());
			service.add(emp);
			model.addAttribute("msg", "Reacord Added Successfully....");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "showMenu";

	}

	
	
	@RequestMapping(value="/addContractEmployeeData1")
	public String addContEmployee1(HttpServletRequest request, ModelMap model) {

		try {
			String EmpNo = request.getParameter("empNo");
			String empName = request.getParameter("empName");
			String sempSal = request.getParameter("empSal");
			String empDept = request.getParameter("empDept");
			String DateOfJoining = request.getParameter("empJoinDate");
			String DateOfBirth = request.getParameter("empBirthDate");
			String empContractor = request.getParameter("contractor");
			String ContractPeriod = request.getParameter("contractPeriod");

			int empNo = Integer.parseInt(EmpNo);
			float empSal = Float.parseFloat(sempSal);
			LocalDate joinDate = Utility.StringToLocalDate(DateOfJoining);
			LocalDate birthDate = Utility.StringToLocalDate(DateOfBirth);
			int empContractPeriod = Integer.parseInt(ContractPeriod);

			float empIncentives = empSal * 11.75f / 100.0f;
			Employee emp = new ContractEmployee(empNo, empName, empSal, empDept, DateOfJoining, DateOfBirth, empContractPeriod,
					empIncentives, empContractor);
			service.add(emp);
			model.addAttribute("msg", "Reacord Added Successfully....");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "showMenu";

	}

}
