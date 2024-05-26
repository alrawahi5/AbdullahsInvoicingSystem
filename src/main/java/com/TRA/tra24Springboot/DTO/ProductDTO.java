package com.TRA.tra24Springboot.DTO;

import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.ProductDetails;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class ProductDTO {

    Integer quantity;
    String category;
    UUID sku;
    ProductDetails productDetails;

    public static ProductDTO convertToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setQuantity(product.getQuantity());
        productDTO.setCategory(product.getCategory());
        productDTO.setSku(product.getSku());
        productDTO.setProductDetails(product.getProductDetails());
        return productDTO;
    }

    public static List<ProductDTO> convertToDTO(List<Product> productList) {
        List<ProductDTO> productrDOTS = new ArrayList<>();
        for (Product oldFromTheDB : productList) {
            ProductDTO dto = convertToDTO(oldFromTheDB);
            productrDOTS.add(dto);
        }
        return productrDOTS;
    }
}
