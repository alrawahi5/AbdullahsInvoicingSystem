package com.TRA.tra24Springboot.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.jmx.export.annotation.ManagedResource;

import java.util.Date;

@Data
@ManagedResource
public class BaseEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
            @Id
    Integer id;

    @CreatedDate
    Date createdDate;

    @UpdateTimestamp
    Date updatedDate;

    Boolean isActive;
}
