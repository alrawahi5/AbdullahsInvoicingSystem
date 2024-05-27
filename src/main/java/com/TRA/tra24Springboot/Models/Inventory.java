package com.TRA.tra24Springboot.Models;

import com.TRA.tra24Springboot.DTO.ProductDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Inventory extends BaseEntity {

    @OneToMany
    List<Product> products;
    String location;
    String manager; //TODO: Update once user class created
    List<String> workers; //TODO: Update user class created

    @ManyToOne
    Supplier supplier;
    String phoneNumber;
    String openingHours;
    String closingHours;
}
