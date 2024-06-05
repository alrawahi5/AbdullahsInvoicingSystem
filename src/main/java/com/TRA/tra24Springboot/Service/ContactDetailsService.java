package com.TRA.tra24Springboot.Service;

import com.TRA.tra24Springboot.DTO.ContactDetailsDTO;
import com.TRA.tra24Springboot.DTO.EmployeeDTO;
import com.TRA.tra24Springboot.DTO.IntentoryDTO;
import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.Employee;
import com.TRA.tra24Springboot.Models.Inventory;
import com.TRA.tra24Springboot.Repository.ContactDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

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

    public ContactDetails updateContactDetails(ContactDetails contactDetails) {

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

        return contactDetailsRepository.save(contactDetails);
    }

    public ContactDetailsDTO reportCotactDetails(ContactDetails contactDetails){
        return  ContactDetailsDTO.convertToDTO(contactDetails);
    }

    public List<ContactDetailsDTO> getByPhoneNumber(String phoneNumber) {
        List<ContactDetails> contactDetails1 = contactDetailsRepository.getByPhoneNumber(phoneNumber);
            return ContactDetailsDTO.contactDetailsDTO(contactDetails1);
        }
}
