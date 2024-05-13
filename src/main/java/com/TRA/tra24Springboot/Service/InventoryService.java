package com.TRA.tra24Springboot.Service;

import com.TRA.tra24Springboot.Models.Inventory;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    public Inventory addInventory(Inventory inventory){

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

        return inventoryRepository.save(inventory);
    }

    public String deleteInventory(Integer id) {
        Inventory inventory = inventoryRepository.findById(id).get();
        if (inventory.getId().equals(id)) {
            inventory.setIsActive(Boolean.FALSE);
            System.out.println(inventory.toString());
        }
        return "Success!";
    }

    public Inventory updateInventory(Inventory inventory){

        List product = new ArrayList<>();
        List workers = new ArrayList<>();

        String invManager = inventory.getManager();
        String invLocation = inventory.getLocation();
        String invPhoneN = inventory.getPhoneNumber();
        Integer invId = inventory.getId();
        //List<Product> invProduct = new inventory.getProducts().get(1);
        String invOpenHours = inventory.getOpeningHours();
        String invSuplier = inventory.getSupplier();
        String invCloseHours = inventory.getClosingHours();


        inventory.setManager(invManager);
        inventory.setLocation(invLocation);
        inventory.setPhoneNumber(invPhoneN);
        inventory.setId(invId);
        inventory.setProducts(product);
        inventory.setOpeningHours(invOpenHours);
        inventory.setSupplier(invSuplier);
        inventory.setClosingHours(invCloseHours);
        inventory.setWorkers(workers);
        inventory.setProducts(product);
        inventory.setCreatedDate(new Date());

        return inventoryRepository.save(inventory);
    }

    public Inventory getInventory(Inventory inventory){
        return inventoryRepository.save(inventory);
    }
}
