package com.bridgelabz.payroll.service;

import com.bridgelabz.payroll.entity.Employee;
import com.bridgelabz.payroll.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpPayrollService implements IEmpPayrollService{
    @Autowired
    EmpRepository jpaRepository;
    public Employee addEmployee(Employee employee){
        return (Employee) jpaRepository.save(employee);
    }
}
