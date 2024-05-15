package com.TRA.tra24Springboot.DTO;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.UserTypes;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class UserDTO {

    String name;
    @Enumerated(EnumType.STRING)
    UserTypes userType;
    ContactDetails contactDetails;
    String accessPrivileges;

    

}
