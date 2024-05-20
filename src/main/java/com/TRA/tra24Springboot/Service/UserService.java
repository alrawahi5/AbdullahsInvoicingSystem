package com.TRA.tra24Springboot.Service;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.Order;
import com.TRA.tra24Springboot.Models.User;
import com.TRA.tra24Springboot.Models.UserTypes;
import com.TRA.tra24Springboot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User adduser(User user) {

        String name;
        UserTypes userType;
        ContactDetails contactDetails;
        String accessPrivileges;
        user.setName("Abdullah");
        user.setUserType(user.getUserType());
        user.setContactDetails(user.getContactDetails());
        user.setAccessPrivileges("drx");
        return userRepository.save(user);
    }

    public String deleteUser(Integer id) {
        User user = userRepository.findById(id).get();

        if (user.getId().equals(id)) {
            user.setIsActive(Boolean.FALSE);
            System.out.println(user.toString());
        }
        return "Success";
    }
}
