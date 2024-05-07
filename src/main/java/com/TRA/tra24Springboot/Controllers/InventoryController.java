package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.Inventory;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.ProductDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Inventory")
public class InventoryController {

    Inventory globalinventory = new Inventory();
    @GetMapping("add")
    public Inventory addInventory(){

        Inventory inventory = new Inventory();
        List product = new ArrayList<>();
        List workers = new ArrayList<>();

        inventory.setManager("Abdullah");
        inventory.setLocation("Muscat");
        inventory.setPhoneNumber("11111");
        inventory.setId(1);
        inventory.setProducts(product);
        inventory.setOpeningHours("9:00am-2:00pm");
        inventory.setSupplier("Omantel");
        inventory.setClosingHours("Weekend hours");
        inventory.setWorkers(workers);
        inventory.setCreatedDate(new Date());
        globalinventory = inventory;

        return inventory;
    }
}
