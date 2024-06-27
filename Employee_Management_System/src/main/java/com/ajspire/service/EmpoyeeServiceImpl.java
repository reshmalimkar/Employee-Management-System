package com.ajspire.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajspire.dao.EmployeeDao;
import com.ajspire.mode.ContractEmployee;
import com.ajspire.mode.Employee;
import com.ajspire.mode.PermanentEmployee;
import com.ajspire.util.Utility;

@Service
public class EmpoyeeServiceImpl implements EmpoyeeService<Employee, Integer> {
	@Autowired
	EmployeeDao dao;

	@Override
	public void add(Employee emp) throws Exception {

		String empType = null;
		if (emp instanceof PermanentEmployee) {
			Employee buildObject = Utility.buildObject(emp);
			empType = "PERMANENT";
			buildObject.setEmpType(empType);
			dao.save(buildObject);

		} else if (emp instanceof ContractEmployee) {
			Employee buildObject = Utility.buildObject(emp);
			empType = "CONTRACT";
			buildObject.setEmpType(empType);
			dao.save(buildObject);
		}
	}

	@Override
	public Employee getById(Integer id) throws Exception {

		Optional<Employee> findById = dao.findById(id);
		Employee employee = findById.get();
		return employee;
	}

	@Override
	public boolean updateById(Integer key, String fieldName, String val) throws Exception {
		boolean SUCCESS = false;
		String empType = null;
		Employee employee = null;
		Optional<Employee> optional = dao.findById(key);
		if (optional.isPresent()) {
			SUCCESS = true;
			employee = optional.get();
			empType = employee.getEmpType();
		}
		if (SUCCESS) {
			if (fieldName.equals("salary")) {
				float newSal = Float.parseFloat(val);
				if (empType.equals("PERMANENT")) {
					float newDa = newSal * 10.0f / 100.0f;
					float newHra = newSal * 7.5f / 100.0f;
					employee.setEmpSal(newSal);
					employee.setDa(newDa);
					employee.setHra(newHra);
					dao.save(employee);
				} else {
					float newIncentives = newSal * 11.75f / 100.0f;
					employee.setEmpSal(newSal);
					employee.setIncentives(newIncentives);
					dao.save(employee);
				}
			} else if (fieldName.equals("department")) {
				employee.setDepartment(val);
				dao.save(employee);
			}
		}
		return SUCCESS;

	}

	@Override
	public Boolean deleteEmpById(Integer empNo) {
		boolean flag = false;
		;

		Optional<Employee> optional = dao.findById(empNo);
		if (optional.isPresent()) {
			dao.deleteById(empNo);
			return true;
		}
		return flag;
	}

}
