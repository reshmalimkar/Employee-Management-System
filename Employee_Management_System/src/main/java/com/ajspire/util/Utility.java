package com.ajspire.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

import com.ajspire.mode.Employee;


public class Utility {
	public static LocalDate StringToLocalDate(String dtr) {
		LocalDate date = null;
		try {// MM-dd-yyyy
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
			java.util.Date input = dateFormat.parse(dtr);
			date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return date;
	}

	public static Employee buildObject(Employee obj) {
		Employee employee = new Employee();
		employee.setEmpNO(obj.getEmpNO());
		employee.setEmpName(obj.getEmpName());
		employee.setEmpSal(obj.getEmpSal());
		employee.setDepartment(obj.getDepartment());
		employee.setDateofJoining(obj.getDateofJoining());
		employee.setDateofBirth(obj.getDateofBirth());
		employee.setEmpType(obj.getEmpType());
		employee.setDa(obj.getDa());
		employee.setHra(obj.getHra());
		employee.setContractPeriod(obj.getContractPeriod());
		employee.setContractor(obj.getContractor());
		employee.setIncentives(obj.getIncentives());
		return employee;
	}
}
