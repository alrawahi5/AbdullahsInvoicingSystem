package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    @Query("SELECT cn from Supplier cn WHERE cn.companyName =:cName")
    List<Supplier> getByCompanyName(@Param("cName") String cn);
}
