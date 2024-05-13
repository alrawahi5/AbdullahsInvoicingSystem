package com.TRA.tra24Springboot.Service;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Repository.ContactDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class ContactDetailsService {
    @Autowired
    ContactDetailsRepository contactDetailsRepository;
    public ContactDetails addContactDetails(ContactDetails contactDetails){
        contactDetails.setId(1);
        contactDetails.setEmail("abdullah@email.com");
        contactDetails.setPhoneNumber("12345678");
        contactDetails.setFaxNumber("87654321");
        contactDetails.setAddress("Muscat, 124 rd");
        contactDetails.setPostalCode("000000000");
        contactDetails.setIsActive(Boolean.TRUE);
        Arrays.asList(contactDetails);
        return contactDetailsRepository.save(contactDetails);
    }

    public String deleteContactDetails(Integer id){
        ContactDetails contactDetails = contactDetailsRepository.findById(id).get();

        if(contactDetails.getId().equals(id)){
            contactDetails.setIsActive(Boolean.FALSE);
            System.out.println(contactDetails.toString());
        }
        return "Success";
    }
}
