package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer> {
    @Query("SELECT pd from ProductDetails pd WHERE pd.name =:name")
    List<ProductDetails> getByProductName(@Param("name") String name);
}
