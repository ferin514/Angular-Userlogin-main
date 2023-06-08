package com.UST.UserLoginSpring.repository;

import com.UST.UserLoginSpring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, java.lang.String> {
}
