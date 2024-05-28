package com.TRA.tra24Springboot.DTO;

import com.TRA.tra24Springboot.Models.Employee;
import com.TRA.tra24Springboot.Models.Inventory;
import com.TRA.tra24Springboot.Models.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EmployeeDTO {

    User user;
    String department;
    String shift;
    String jobTitle;
    String nextOfKin;
    String location;
    String civilID;

    public static EmployeeDTO convertToDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setUser(employee.getUser());
        employeeDTO.setDepartment(employee.getDepartment());
        employeeDTO.setShift(employee.getShift());
        employeeDTO.setJobTitle(employee.getJobTitle());
        employeeDTO.setNextOfKin(employee.getNextOfKin());
        employeeDTO.setLocation(employee.getLocation());
        employeeDTO.setCivilID(employee.getCivilID());

        return employeeDTO;
    }

    public static List<EmployeeDTO> convertToDTO(List<Employee> employees) {
        List<EmployeeDTO> employeeDTOS = new ArrayList<>();
        for (Employee oblFromTheDB : employees) {
            EmployeeDTO dto = convertToDTO(oblFromTheDB);
            employeeDTOS.add(dto);
        }
        return employeeDTOS;
    }
}
