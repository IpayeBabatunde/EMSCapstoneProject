package com.ipaye.emscapstoneproject.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name="employee_table")
@Data
@ToString
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long Id;

    @Column(name="First_Name")
    private String firstName;

    @Column(name="Last_Name")
    private String lastName;

    @Column(name="Email_Id")
    private String emailId;

    @Column(name="Job_Title")
    private String jobTitle;

    @Column(name="Department_Name")
    private String departmentName;

    @Column(name="Phone_Number")
    private String PhoneNumber;

    public Employee(){

    }

    public Employee(Long id, String firstName, String lastName, String emailId, String jobTitle, String departmentName, String phoneNumber) {
        this.Id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailId=emailId;
        this.jobTitle=jobTitle;
        this.departmentName=departmentName;
        this.PhoneNumber=phoneNumber;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id=id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId=emailId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle=jobTitle;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentName=departmentId;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber=phoneNumber;
    }
}
