package com.TRA.tra24Springboot.Service;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Models.User;
import com.TRA.tra24Springboot.Models.UserTypes;
import com.TRA.tra24Springboot.Repository.ProductDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProductDetailsService {

    @Autowired
    ProductDetailsRepository productDetailsRepository;

    public ProductDetails addProdDetails(ProductDetails productDetails) {


        productDetails.setName("Abdullah");
        productDetails.setCountryOfOrigin("Oman");
        productDetails.setExpiryDate(new Date());
        productDetails.setSize("12");
        productDetails.setColor("purple");
        productDetails.setDescription("electronics");
        productDetails.setPrice(198.8);
        return productDetailsRepository.save(productDetails);
    }
}
