package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.function.Supplier;

public interface SupplierInterface extends JpaRepository<Supplier, Integer> {
}
