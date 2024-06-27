package com.ajspire.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ajspire.service.EmpoyeeService;

@Controller
public class UpdateSalaryController {

	@Autowired
	private EmpoyeeService service;
    @RequestMapping("/updateSal")
    public String updateSalary() {
        return "updateSalary";
    }

    @PostMapping(value = "/updateSalary")
    public String updateSalaryDetails(HttpServletRequest request, HttpServletResponse response) {
    	boolean success=false;
		String EmpNo = request.getParameter("empNO");
		int empNO = Integer.parseInt(EmpNo);
		String newSal = request.getParameter("empSal");
		try {
			success=service.updateById(empNO, "salary", newSal);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if(success) {
			return "success";
		}
		else {
			return "fail";
		}

    }
   
}
