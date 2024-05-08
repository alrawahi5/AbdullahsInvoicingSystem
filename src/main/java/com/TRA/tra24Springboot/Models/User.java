package com.TRA.tra24Springboot.Models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class User extends BaseEntity {

    String name;
    UserTypes userType;
    ContactDetails contactDetails;
    String accessPrivileges; //TODO: add an enum for accessPrivileges


}
