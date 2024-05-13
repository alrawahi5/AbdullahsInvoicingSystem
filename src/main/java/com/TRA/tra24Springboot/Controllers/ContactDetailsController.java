package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Service.ContactDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
@RequestMapping("contact-details")
public class ContactDetailsController {

    @Autowired
    ContactDetailsService contactDetailsService;

    @GetMapping("add")
    public ContactDetails addContactDetails(ContactDetails contactDetails) {
        return contactDetailsService.addContactDetails(contactDetails);
    }

    @PostMapping("delete")
    public String deleteContactDetails(@RequestParam Integer id){
        contactDetailsService.deleteContactDetails(id);
        return "Success";
    }

    @PutMapping("update-contact")
    public ContactDetails updateContactDetails(@RequestBody ContactDetails contactDetails) {

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

    /*@GetMapping("get")
    public  ContactDetails reportCotactDetails(){
        return  contactDetails;
    }*/
}

