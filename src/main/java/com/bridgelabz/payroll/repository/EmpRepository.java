package com.bridgelabz.payroll.repository;

import com.bridgelabz.payroll.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {
}