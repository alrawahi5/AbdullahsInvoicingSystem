package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Repository.ProductRepository;
import com.TRA.tra24Springboot.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("add")
    public Product addProduct(Product product) {
        return productService.addProduct(product);
    }

    @PostMapping("delete")
    public String deleteProduct(@RequestParam Integer id) {
        productService.deleteProduct(id);
        return "Success!";
    }
    @PutMapping("update")
    public Product updateProduct(@RequestBody Product userProduct) {
        return productService.updateProduct(userProduct);
    }

    /*@GetMapping("get")
    public Product reportProduct() {
        return globalProduct;
    }*/
}
