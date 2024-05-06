package com.TRA.tra24Springboot.Models;

import lombok.Data;
import lombok.Generated;

import java.util.Date;

@Data
public class BaseEntity {

    Integer id;
    Date createdDate;
    Date updatedDate;
    Boolean isActive;
}
