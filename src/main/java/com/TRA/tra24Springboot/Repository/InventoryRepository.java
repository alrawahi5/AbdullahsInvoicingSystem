package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.Inventory;
import com.TRA.tra24Springboot.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

    @Query("SELECT p from Inventory p WHERE p.phoneNumber =:phoneNumber")
    List<Inventory> getByPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
