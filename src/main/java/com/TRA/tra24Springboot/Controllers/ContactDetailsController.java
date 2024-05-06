package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.ContactDetails;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/contact-details")
public class ContactDetailsController {

    ContactDetails contactDetails = new ContactDetails();

    @GetMapping
    public ContactDetails addContactDetails(){
        ContactDetails contactDetails1 = new ContactDetails();

        contactDetails.setEmail("abdullah@email.com");
        contactDetails.setPhoneNumber("12345678");
        contactDetails.setFaxNumber("87654321");
        contactDetails.setAddress("Muscat, 124 rd");
        contactDetails.setPostalCode("000000000");

        contactDetails = contactDetails1;
        return contactDetails;
    }


}