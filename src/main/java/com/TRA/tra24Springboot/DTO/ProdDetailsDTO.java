package com.TRA.tra24Springboot.DTO;

import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Models.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class ProdDetailsDTO {

    String name;
    String countryOfOrigin;
    Date expiryDate;
    String size;
    String color;
    String description;
    Double price;

    public static ProdDetailsDTO convertToDTO(ProductDetails productDetails) {
        ProdDetailsDTO prodDetailsDTO = new ProdDetailsDTO();
        prodDetailsDTO.setName(productDetails.getName());
        prodDetailsDTO.setCountryOfOrigin(productDetails.getCountryOfOrigin());
        prodDetailsDTO.setExpiryDate(productDetails.getExpiryDate());
        prodDetailsDTO.setSize(productDetails.getSize());
        prodDetailsDTO.setColor(productDetails.getColor());
        prodDetailsDTO.setDescription(productDetails.getDescription());
        prodDetailsDTO.setPrice(productDetails.getPrice());

        return prodDetailsDTO;
    }

    public static List<ProdDetailsDTO> convertToDTO(List<ProductDetails> prodList) {
        List<ProdDetailsDTO> prodDetailsDTOS = new ArrayList<>();
        for (ProductDetails oblFromTheDB : prodList) {
            ProdDetailsDTO dto = convertToDTO(oblFromTheDB);
            prodDetailsDTOS.add(dto);
        }
        return prodDetailsDTOS;
    }
}
