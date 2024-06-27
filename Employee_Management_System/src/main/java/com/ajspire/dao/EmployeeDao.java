package com.ajspire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajspire.mode.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
