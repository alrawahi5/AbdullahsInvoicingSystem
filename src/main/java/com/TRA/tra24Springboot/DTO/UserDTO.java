package com.TRA.tra24Springboot.DTO;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.User;
import com.TRA.tra24Springboot.Models.UserTypes;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDTO {

    String name;
    UserTypes userType;
    ContactDetails contactDetails;
    String accessPrivileges;

    public static UserDTO convertToDTO(User user) {
        UserDTO userDOT = new UserDTO();
        userDOT.setName(user.getName());
        userDOT.setUserType(user.getUserType());
        userDOT.setContactDetails(user.getContactDetails());
        user.setAccessPrivileges(user.getAccessPrivileges());

        return userDOT;
    }

    public static List<UserDTO> convertToDTO(List<User> userList) {
        List<UserDTO> userDOTS = new ArrayList<>();
        for (User oblFromTheDB : userList) {
            UserDTO dto = convertToDTO(oblFromTheDB);
            userDOTS.add(dto);
        }
        return userDOTS;
    }

}
