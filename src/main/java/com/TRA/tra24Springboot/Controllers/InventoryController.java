package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.Inventory;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Service.InventoryService;
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
    public String deleteInventory(@PathVariable Integer id) {
        inventoryService.deleteInventory(id);
        return "Success!";
    }
}
