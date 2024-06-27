package com.ajspire.mode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_master")
public class Employee {
	@Id
	@Column(name = "emp_no")
	private int empNO;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "emp_sal")
	private float empSal;
	@Column(name = "emp_Dept")
	private String department;
	@Column(name = "emp_join_date")
	private String dateofJoining;
	@Column(name = "emp_birth_date")
	private String dateofBirth;
	@Column(name = "emp_type")
	private String empType;
	@Column(name = "emp_perm_da")
	private float da;
	@Column(name = "emp_perm_hra")
	private float hra;
	@Column(name = "emp_cont_period")
	private int contractPeriod;
	@Column(name = "emp_cont_contractor")
	private String contractor;
	@Column(name = "emp_cont_incentives")
	private float incentives;

	public int getEmpNO() {
		return empNO;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getDa() {
		return da;
	}

	public void setDa(float da) {
		this.da = da;
	}

	public String getDateofJoining() {
		return dateofJoining;
	}

	public void setDateofJoining(String dateofJoining) {
		this.dateofJoining = dateofJoining;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	public int getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public float getIncentives() {
		return incentives;
	}

	public void setIncentives(float incentives) {
		this.incentives = incentives;
	}

	public Employee(int empNO, String empName, float empSal, String department, String dateofJoining,
			String dateofBirth, float empDa, float empHra) {
		super();
		this.empNO = empNO;
		this.empName = empName;
		this.empSal = empSal;
		this.department = department;
		this.dateofJoining = dateofJoining;
		this.dateofBirth = dateofBirth;
		this.da = empDa;
		this.hra = empHra;
	}

	public Employee(int empNO, String empName, float empSal, String department, String dateofJoining,
			String dateofBirth, int empContractPeriod, float empIncentives, String empContractor) {
		super();
		this.empNO = empNO;
		this.empName = empName;
		this.empSal = empSal;
		this.department = department;
		this.dateofJoining = dateofJoining;
		this.dateofBirth = dateofBirth;
		this.contractPeriod = empContractPeriod;
		this.incentives = empIncentives;
		this.contractor = empContractor;
	}

	public Employee() {
	}

}
