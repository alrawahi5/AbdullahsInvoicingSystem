package com.TRA.tra24Springboot.Repository;

import com.TRA.tra24Springboot.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
