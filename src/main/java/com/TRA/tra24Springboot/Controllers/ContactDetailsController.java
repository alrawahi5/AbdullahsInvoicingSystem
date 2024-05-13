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

    @PutMapping("update")
    public ContactDetails updateContactDetails(@RequestBody ContactDetails contactDetails) {
        return contactDetailsService.updateContactDetails(contactDetails);
    }

    @GetMapping("get")
    public  ContactDetails reportCotactDetails(ContactDetails contactDetails){
        return contactDetailsService.reportCotactDetails(contactDetails);
    }
}

