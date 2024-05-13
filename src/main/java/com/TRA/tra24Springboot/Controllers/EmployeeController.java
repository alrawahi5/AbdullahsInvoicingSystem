package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.Employee;
import com.TRA.tra24Springboot.Models.User;
import com.TRA.tra24Springboot.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
@RestController
@RequestMapping("Employee")
public class EmployeeController {

    Employee employee = new Employee();

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("add")
    public Employee addEmployee(){
        Employee employeeAdded = new Employee();
        User user = new User();
        user.setName("Abdullah");
        user.setId(1);
        user.setAccessPrivileges("drx");

        employeeAdded.setId(3);
        employeeAdded.setShift("9:00am");
        employeeAdded.setDepartment("Networks and Security");
        employeeAdded.setLocation("Muscat");
        employeeAdded.setJobTitle("Cyber Security Assistant");
        employeeAdded.setCivilID("1234567");
        employee.setNextOfKin("9:00am");
        //employeeAdded.setUser(user);

        employee = employeeAdded;
        Arrays.asList(employeeAdded);
        return employeeRepository.save(employeeAdded);
    }

    @PostMapping("delete/{id}")
    public String deleteEmployee(@PathVariable Integer id){

        if(employee.getId().equals(id)){
            employee.setIsActive(Boolean.FALSE);
            System.out.println(employee.toString());

        }
        return "Success!";
    }

    @PutMapping("update-employee")
    public Employee updateEmployee(@RequestBody Employee employee){

        String emploShift = employee.getShift();
        String emploCivilID = employee.getCivilID();
        String emploDepartment = employee.getDepartment();
        String emploJobTiltel = employee.getJobTitle();
        String emploLocatoin = employee.getLocation();
        String emploNexOfKin = employee.getNextOfKin();
        User emploUser = employee.getUser();
        employee.setUpdatedDate(new Date());

        employee.setShift(emploShift);
        employee.setCivilID(emploCivilID);
        employee.setDepartment(emploDepartment);
        employee.setJobTitle(emploJobTiltel);
        employee.setLocation(emploLocatoin);
        employee.setNextOfKin(emploNexOfKin);
        employee.setUser(emploUser);
        employee.setUpdatedDate(new Date());

        return employee;
    }

    @GetMapping("get")
    public  Employee  reportEmployee(){
        //System.out.println("The report of the Emplpyee controller is as follows: ");
        return  employee;
    }
}
