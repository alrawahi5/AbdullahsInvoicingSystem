package com.TRA.tra24Springboot.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.jmx.export.annotation.ManagedResource;

import java.util.Date;

@Data
@MappedSuperclass
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
