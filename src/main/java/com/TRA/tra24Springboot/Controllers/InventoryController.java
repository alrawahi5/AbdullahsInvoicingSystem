package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.DTO.IntentoryDTO;
import com.TRA.tra24Springboot.DTO.ProdDetailsDTO;
import com.TRA.tra24Springboot.Models.Inventory;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Service.InventoryService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("Inventory")
public class InventoryController {

    Inventory globalinventory = new Inventory();

    @Autowired
    InventoryService inventoryService;
    @PostMapping("add")
    public Inventory addInventory(Inventory inventory){
        return inventoryService.addInventory(inventory);
    }

    @PostMapping("delete")
    public String deleteInventory(@RequestParam Integer id) {
        inventoryService.deleteInventory(id);
        return "Success!";
    }

    @PutMapping("update")
    public Inventory updateInventory(@RequestBody Inventory inventory){
        return inventoryService.updateInventory(inventory);
    }

    @GetMapping("get")
    public Inventory getInventory(Inventory inventory){
        return inventoryService.getInventory(inventory);
    }

    @GetMapping("getByPhoneNumber")
    public List<IntentoryDTO> getByPhoneNumber(@RequestParam String phoneNumber) {
        return inventoryService.getByPhoneNumber(phoneNumber);
    }
}
