package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer> {
}
