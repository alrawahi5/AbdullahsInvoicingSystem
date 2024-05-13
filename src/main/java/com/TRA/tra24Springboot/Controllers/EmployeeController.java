package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.Employee;
import com.TRA.tra24Springboot.Models.User;
import com.TRA.tra24Springboot.Repository.EmployeeRepository;
import com.TRA.tra24Springboot.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
@RestController
@RequestMapping("Employee")
public class EmployeeController {

    Employee employee = new Employee();

    @Autowired
    EmployeeService employeeService;

    @GetMapping("add")
    public Employee addEmployee(Employee employeeAdded){
        return employeeService.addEmployee(employeeAdded);
    }

    @PostMapping("delete")
    public String deleteEmployee(@RequestParam Integer id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("update")
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
