package com.TRA.tra24Springboot.Service;

import com.TRA.tra24Springboot.Controllers.EmployeeController;
import com.TRA.tra24Springboot.Models.Employee;
import com.TRA.tra24Springboot.Models.User;
import com.TRA.tra24Springboot.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;
import java.util.Date;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employeeAdded){
        employeeAdded.setId(3);
        employeeAdded.setShift("9:00am");
        employeeAdded.setDepartment("Networks and Security");
        employeeAdded.setLocation("Muscat");
        employeeAdded.setJobTitle("Cyber Security Assistant");
        employeeAdded.setCivilID("1234567");
        employeeAdded.setNextOfKin("9:00am");
        Arrays.asList(employeeAdded);
        return employeeRepository.save(employeeAdded);
    }

    public String deleteEmployee(Integer id){
       Employee employee = employeeRepository.findById(id).get();
        if(employee.getId().equals(id)){
            employee.setIsActive(Boolean.FALSE);
            System.out.println(employee.toString());

        }
        return "Success!";
    }

    public Employee updateEmployee(Employee employee){

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

        return employeeRepository.save(employee);
    }
}
