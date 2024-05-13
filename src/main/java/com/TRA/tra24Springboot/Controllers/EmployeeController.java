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
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("get")
    public  Employee  reportEmployee(){
        //System.out.println("The report of the Emplpyee controller is as follows: ");
        return  employee;
    }
}
