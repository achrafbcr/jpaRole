package com.achraf.jparole.repositories;

import com.achraf.jparole.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String userName);
}
