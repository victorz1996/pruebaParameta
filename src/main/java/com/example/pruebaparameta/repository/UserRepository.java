package com.example.pruebaparameta.repository;

import com.example.pruebaparameta.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByNumeroDocumento(String id);
}
