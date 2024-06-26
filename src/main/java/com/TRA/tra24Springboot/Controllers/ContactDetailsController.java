package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.DTO.ContactDetailsDTO;
import com.TRA.tra24Springboot.DTO.EmployeeDTO;
import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Service.ContactDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

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
    public ContactDetailsDTO reportCotactDetails(ContactDetails contactDetails){
        return contactDetailsService.reportCotactDetails(contactDetails);
    }

    @GetMapping("getByPhoneNumber")
    public List<ContactDetailsDTO> getByPhoneNumber(@RequestParam String phoneNumber) {
        return contactDetailsService.getByPhoneNumber(phoneNumber);
    }
}

