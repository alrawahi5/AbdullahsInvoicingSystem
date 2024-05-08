package com.TRA.tra24Springboot.Models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Employee extends BaseEntity {

    User user;
    String department;
    String shift;
    String jobTitle;
    String nextOfKin;
    String location;
    String civilID;

}
