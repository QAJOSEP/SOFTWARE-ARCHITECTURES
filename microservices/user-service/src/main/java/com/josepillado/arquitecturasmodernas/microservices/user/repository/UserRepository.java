package com.josepillado.arquitecturasmodernas.microservices.user.repository;

import com.josepillado.arquitecturasmodernas.microservices.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
