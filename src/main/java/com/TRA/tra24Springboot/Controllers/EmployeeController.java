package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.Employee;
import com.TRA.tra24Springboot.Models.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
@RestController
@RequestMapping("Employee")
public class EmployeeController {
    Employee employee = new Employee();

    @GetMapping("add")
    public Employee addEmployee(){
        Employee employeeAdded = new Employee();
        User user = new User();
        user.setName("Abdullah");
        user.setId(1);
        user.setAccessPrivileges("drx");

        employeeAdded.setId(1);
        employeeAdded.setShift("9:00am");
        employeeAdded.setDepartment("Networks and Security");
        employeeAdded.setLocation("Muscat");
        employeeAdded.setJobTitle("Cyber Security Assistant");
        employeeAdded.setCivilID("1234567");
        employeeAdded.setUser(user);

        employee = employeeAdded;
        return employee;
    }



}
