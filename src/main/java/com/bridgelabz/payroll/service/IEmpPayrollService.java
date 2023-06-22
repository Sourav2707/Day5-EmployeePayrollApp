package com.bridgelabz.payroll.service;

import com.bridgelabz.payroll.entity.EmployeeData;

import java.util.Optional;

public interface IEmpPayrollService {
    EmployeeData addEmployee(EmployeeData employee);
    Optional getEmployeeDataById(long empId);
    EmployeeData updateEmployee(long empId, EmployeeData employeeData);
    void deleteEmployeeById(long empId);
}
