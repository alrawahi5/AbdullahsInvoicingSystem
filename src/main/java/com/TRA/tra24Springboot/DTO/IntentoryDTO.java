package com.TRA.tra24Springboot.DTO;

import com.TRA.tra24Springboot.Models.Inventory;
import com.TRA.tra24Springboot.Models.Order;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.Supplier;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class IntentoryDTO {

    List<ProductDTO> products;
    String location;
    String manager;
    List<String> workers;
    SupplierDTO supplier;
    String phoneNumber;
    String openingHours;
    String closingHours;

    public static IntentoryDTO convertToDTO(Inventory inventory) {
        IntentoryDTO intentoryDTO = new IntentoryDTO();
        intentoryDTO.setProducts(ProductDTO.convertToDTO(inventory.getProducts()));
        intentoryDTO.setLocation(inventory.getLocation());
        intentoryDTO.setManager(intentoryDTO.getManager());
        intentoryDTO.setWorkers(inventory.getWorkers());
        intentoryDTO.setSupplier(SupplierDTO.convertToDTO(inventory.getSupplier()));
        intentoryDTO.setPhoneNumber(inventory.getPhoneNumber());
        intentoryDTO.setOpeningHours(inventory.getOpeningHours());
        intentoryDTO.setClosingHours(inventory.getClosingHours());
        return intentoryDTO;
    }

    public static List<IntentoryDTO> convertToDTO(List<Inventory> inventories) {
        List<IntentoryDTO> intentoryDTOS = new ArrayList<>();
        for (Inventory oblFromTheDB : inventories) {
            IntentoryDTO dto = convertToDTO(oblFromTheDB);
            intentoryDTOS.add(dto);
        }
        return intentoryDTOS;
    }

}
