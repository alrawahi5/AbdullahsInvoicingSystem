package com.TRA.tra24Springboot.DTO;

import com.TRA.tra24Springboot.Models.ContactDetails;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ContactDetailsDTO {

    Integer contactID;
    Boolean isActive;

    public static ContactDetailsDTO convertToDTO(ContactDetails contactDetails) {
        ContactDetailsDTO contactDetailsDTO = new ContactDetailsDTO();
        contactDetailsDTO.setContactID(contactDetails.getId());
        contactDetailsDTO.setIsActive(contactDetails.getIsActive());
        return contactDetailsDTO;
    }

    public static List<ContactDetailsDTO> contactDetailsDTO(List<ContactDetails> contactDetailsList) {
        List<ContactDetailsDTO> contactDetailsDTOS = new ArrayList<>();
        for (ContactDetails oblFromTheDB : contactDetailsList) {
            ContactDetailsDTO dto = convertToDTO(oblFromTheDB);
            contactDetailsDTOS.add(dto);
        }
        return contactDetailsDTOS;
    }
}
