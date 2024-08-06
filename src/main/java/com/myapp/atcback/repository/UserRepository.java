package com.myapp.atcback.repository;

import com.myapp.atcback.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
