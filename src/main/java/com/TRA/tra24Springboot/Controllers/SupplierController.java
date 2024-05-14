package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @PostMapping("add")
    public SupplierController addSupplier(Supplier supplier){
        return supplierService.addSupplier(supplier);
    }

    @PostMapping("delete")
    public SupplierController deleteSupplier(@RequestParam Supplier supplier){
        return supplierService.deleteSupplier(supplier);
    }

    @PutMapping("update")
    public SupplierController updateSupplier(@RequestBody Supplier supplier){
        return supplierService.updateSupplier(supplier);
    }

    @GetMapping("get")
    public List<SupplierDOT> getSchool(){
        return supplierService.getSchools();
}
}
