package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Integer> {

    @Query("SELECT p from ContactDetails p WHERE p.phoneNumber =:phoneNumber")
    List<ContactDetails> getByPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
