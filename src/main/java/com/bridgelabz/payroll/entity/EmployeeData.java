package com.bridgelabz.payroll.entity;


import com.bridgelabz.payroll.dto.EmployeeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class EmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String profilePic;
    private String gender;
    private String salary;
    private LocalDate startDate;
    private String notes;

    public EmployeeData(EmployeeDTO employeeDTO) {
    }

    public EmployeeData(Long id, String name, String profilePic, String gender, String salary, LocalDate startDate, String notes) {
        this.id = id;
        this.name = name;
        this.profilePic = profilePic;
        this.gender = gender;
        this.salary = salary;
        this.startDate = startDate;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", gender='" + gender + '\'' +
                ", salary='" + salary + '\'' +
                ", startDate=" + startDate +
                ", notes='" + notes + '\'' +
                '}';
    }
}