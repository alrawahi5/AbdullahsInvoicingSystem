package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.ProductDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("contact-details")
public class ContactDetailsController {

    ContactDetails contactDetails = new ContactDetails();

    @GetMapping("add")
    public ContactDetails addContactDetails(){
        ContactDetails contactDetails1 = new ContactDetails();

        contactDetails1.setId(1);
        contactDetails1.setEmail("abdullah@email.com");
        contactDetails1.setPhoneNumber("12345678");
        contactDetails1.setFaxNumber("87654321");
        contactDetails1.setAddress("Muscat, 124 rd");
        contactDetails1.setPostalCode("000000000");

        contactDetails = contactDetails1;
        return contactDetails;
    }

    @PostMapping("delete/{id}")
    public String deleteProduct(@PathVariable Integer id){

        if(contactDetails.getId().equals(id)){
            contactDetails.setIsActive(Boolean.FALSE);
            System.out.println(contactDetails.toString());

        }
        return "Success!";
    }

    @PutMapping("update-contact")
    public ContactDetails updateContactDetails(@RequestBody ContactDetails contactDetails){

        String cttEmail = contactDetails.getEmail();
        String cttPhoneN = contactDetails.getPhoneNumber();
        String cttFax = contactDetails.getFaxNumber();
        String cttAddress = contactDetails.getAddress();
        String cttPostal = contactDetails.getPostalCode();
        contactDetails.setUpdatedDate(new Date());

        contactDetails.setEmail(cttEmail);
        contactDetails.setPhoneNumber(cttPhoneN);
        contactDetails.setFaxNumber(cttFax);
        contactDetails.setAddress(cttAddress);
        contactDetails.setPostalCode(cttPostal);
        contactDetails.setUpdatedDate(new Date());

        return contactDetails;
    }

    @GetMapping("get")
    public  ContactDetails reportCotactDetails(){
        return  contactDetails;
    }
    }

