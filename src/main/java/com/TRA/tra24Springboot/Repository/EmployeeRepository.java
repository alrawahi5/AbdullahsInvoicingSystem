package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
