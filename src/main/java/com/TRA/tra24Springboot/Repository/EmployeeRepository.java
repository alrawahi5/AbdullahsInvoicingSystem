package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.Employee;
import com.TRA.tra24Springboot.Models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e from Employee e WHERE e.civilID =:civilID")
    List<Employee> getByCivilID(@Param("civilID") String civilID);
}
