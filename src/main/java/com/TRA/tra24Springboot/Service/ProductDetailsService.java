package com.TRA.tra24Springboot.Service;

import com.TRA.tra24Springboot.DTO.ProdDetailsDTO;
import com.TRA.tra24Springboot.DTO.SupplierDTO;
import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Models.Supplier;
import com.TRA.tra24Springboot.Models.User;
import com.TRA.tra24Springboot.Repository.ProductDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

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

    public String deleProdDetails(@RequestParam Integer id) {

        ProductDetails productDetails = productDetailsRepository.findById(id).get();
        if (productDetails.getId().equals(id)) {
            productDetails.setIsActive(Boolean.FALSE);
            System.out.println(productDetails.toString());
        }
        return "Success";
    }

    public ProductDetails updateUserProdDetails(@RequestBody ProductDetails productDetails) {
        ProductDetails prodDetailsEntity = productDetailsRepository.findById(productDetails.getId()).get();
        prodDetailsEntity = productDetails;
        productDetails.setUpdatedDate(new Date());

        return productDetailsRepository.save(prodDetailsEntity);
    }

    public List<ProdDetailsDTO> getProdDetails() {
        List<ProductDetails> productDetails = productDetailsRepository.findAll();
        return ProdDetailsDTO.convertToDTO(productDetails);
    }

    public List<ProdDetailsDTO> getByProductName(String name){
        List<ProductDetails> productDetails = productDetailsRepository.getByProductName(name);
        return ProdDetailsDTO.convertToDTO(productDetails);
    }
}
