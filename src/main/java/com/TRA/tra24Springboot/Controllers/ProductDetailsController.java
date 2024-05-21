package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.DTO.UserDTO;
import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Models.User;
import com.TRA.tra24Springboot.Service.ProductDetailsService;
import com.TRA.tra24Springboot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.PropertyPermission;

@RestController
@RequestMapping("productDetails")
public class ProductDetailsController {

    @Autowired
    ProductDetailsService productDetailsuserService;

    @PostMapping("add")
    public ProductDetails addProdDetails(ProductDetails productDetails) {
        return productDetailsuserService.addProdDetails(productDetails);
    }

    @PostMapping("delete")
    public String deleProdDetails(@RequestParam Integer id) {
        productDetailsuserService.deleProdDetails(id);
        return "Success";
    }

    @PutMapping("update")
    public ProductDetails updateUserProdDetails(@RequestBody ProductDetails productDetails) {
        return productDetailsuserService.updateUserProdDetails(productDetails);
    }

    @GetMapping("get")
    public List<ProdDetailsDTO> getProdDetals() {
        List<ProductDetails> productDetails = productDetailsuserService.findAll();
        return ProdDetailsDTO.convertToDTO(productDetails);
    }
}



