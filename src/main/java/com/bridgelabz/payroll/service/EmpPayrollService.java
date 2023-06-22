package com.bridgelabz.payroll.service;

import com.bridgelabz.payroll.entity.EmployeeData;
import com.bridgelabz.payroll.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpPayrollService implements IEmpPayrollService{
    @Autowired
    EmpRepository jpaRepository;

    public Optional getEmployeeDataById(long empId){
        return jpaRepository.findById(empId);
    }

    public EmployeeData addEmployee(EmployeeData employeeData){
        return (EmployeeData) jpaRepository.save(employeeData);
    }

    public EmployeeData updateEmployee(long empId, EmployeeData employeeData){
        employeeData.setId(empId);
        return (EmployeeData) jpaRepository.save(employeeData);
    }

    public void deleteEmployeeById(long empId){
        jpaRepository.deleteById(empId);
    }
}