package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.Order;
import com.TRA.tra24Springboot.Models.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query("SELECT o from Order o WHERE o.description =:description")
    List<Order> getByDescriptione(@Param("description") String description);
}
