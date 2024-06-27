package com.ajspire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajspire.service.EmpoyeeService;

@Controller
public class DeleteController {

	@Autowired
	private EmpoyeeService service;
    @RequestMapping("/deleteEmp")
    public String deleteEmp() {
        return "deleteEmployee";
    }

    @PostMapping("/deleteEmployeeData")
    public String deleteEmployeeData(@RequestParam(name = "empNo") String empNo) {
      
    	Boolean flag=service.deleteEmpById(Integer.parseInt(empNo));
    	if(flag) {
    	return "successDeleted";	
    	}
    	return "fail";
    }
    }
