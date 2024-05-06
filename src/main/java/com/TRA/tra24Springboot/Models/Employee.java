package com.TRA.tra24Springboot.Models;

import lombok.Data;

@Data
public class Employee extends BaseEntity {

    User user;
    String department;
    String shift;
    String jobTitle;
    String nextOfKin;
    String location;
    String civilID;

}
