package com.TRA.tra24Springboot.Models;

import lombok.Data;

@Data
public class ContactDetails extends BaseEntity {

    String email;
    String phoneNumber;
    String faxNumber;
    String address;
    String postalCode;

}
