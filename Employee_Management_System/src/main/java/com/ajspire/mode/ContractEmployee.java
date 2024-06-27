package com.ajspire.mode;

import java.time.LocalDate;

public class ContractEmployee extends Employee {
	private int contractPeriod;
	private String contractor;
	private float incentives;
	public ContractEmployee(Integer empNo, String empName, float empSal, String empDept,
			String joinDate, String birthDate, int empContractPeriod, float empIncentives,String empContractor) {
		super(empNo, empName, empSal, empDept, joinDate, birthDate, empContractPeriod, empIncentives, empContractor);
		this.contractPeriod=empContractPeriod;
		this.incentives=empIncentives;
		this.contractor=empContractor;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + contractPeriod;
		result = prime * result + ((contractor == null) ? 0 : contractor.hashCode());
		result = prime * result + Float.floatToIntBits(incentives);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContractEmployee other = (ContractEmployee) obj;
		if (contractPeriod != other.contractPeriod)
			return false;
		if (contractor == null) {
			if (other.contractor != null)
				return false;
		} else if (!contractor.equals(other.contractor))
			return false;
		if (Float.floatToIntBits(incentives) != Float.floatToIntBits(other.incentives))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ContractEmployee [contractPeriod=" + contractPeriod + ", contractor=" + contractor + ", incentives="
				+ incentives + "]";
	}
	
	public float processSalary() {
		// TODO Auto-generated method stub
		float empSal=getEmpSal();
		float sal=empSal+incentives;
		return sal;
	}
	

}
