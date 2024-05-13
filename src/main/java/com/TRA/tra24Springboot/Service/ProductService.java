package com.TRA.tra24Springboot.Service;

import com.TRA.tra24Springboot.Controllers.ProductController;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product addProduct(Product product) {
        /*ProductDetails productDetails = new ProductDetails();
        productDetails.setId(1);
        productDetails.setName("Apple");
        productDetails.setColor("Green");
        productDetails.setSize("Small");
        productDetails.setPrice(10d);
        productDetails.setCountryOfOrigin("USA");
        productDetails.setDescription("Apple Product");*/

        //product.setProductDetails(productDetails);
        product.setSku(UUID.randomUUID());
        product.setCategory("Electronics");
        product.setQuantity(1);
        product.setId(1);
        product.setIsActive(Boolean.TRUE);
        product.setCreatedDate(new Date());

        return productRepository.save(product);
    }

    public String deleteProduct(Integer id) {
       Product product = productRepository.findById(id).get();
        if (product.getId().equals(id)) {
            product.setIsActive(Boolean.FALSE);
            System.out.println(product.toString());
        }
        return "Success!";
    }

    public Product updateProduct(Product userProduct) {

        UUID prodUUID = userProduct.getSku();
        String prodCat = userProduct.getCategory();
        Integer prodId = userProduct.getId();
        Date prodDate = userProduct.getUpdatedDate();

        userProduct.setSku(prodUUID);
        userProduct.setCategory(prodCat);
        userProduct.setId(prodId);
        userProduct.setCreatedDate(new Date());

        return productRepository.save(userProduct);
    }

    public Product reportProduct(Product product) {
        return productRepository.save(product);
    }
}
