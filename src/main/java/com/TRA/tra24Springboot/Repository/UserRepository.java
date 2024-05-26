package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u from User u WHERE u.name =:name")
    List<User> getByUserName(@Param("name") String userName);
}
