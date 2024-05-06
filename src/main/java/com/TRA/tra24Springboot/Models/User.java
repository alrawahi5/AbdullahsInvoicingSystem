package com.TRA.tra24Springboot.Models;

import lombok.Data;

@Data
public class User extends BaseEntity {

    String name;
    UserTypes userType;
    ContactDetails contactDetails;
    String accessPrivileges; //TODO: add an enum for accessPrivileges


}
