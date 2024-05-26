package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.DTO.SupplierDTO;
import com.TRA.tra24Springboot.Models.Supplier;
import com.TRA.tra24Springboot.Models.User;
import com.TRA.tra24Springboot.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @PostMapping("add")
    public Supplier addSupplier(Supplier supplier){
        return supplierService.addSupplier(supplier);
    }

   @PostMapping("delete")
    public String deleteSupplier(@RequestParam Integer id){
        supplierService.deleteSupplier(id);
        return "success";
    }

    @PutMapping("update")
    public Supplier updateSupplier(@RequestBody Supplier supplier){
        return supplierService.updateSupplier(supplier);
    }

    @GetMapping("get")
    public List<SupplierDTO> getSupplier() {
        return supplierService.getSupplier();
    }

    @GetMapping("getByName")
    public List<SupplierDTO> getByCompanyName(@RequestParam String cName) {
        return supplierService.getByCompanyName(cName);
    }
}

