package com.josepillado.arquitecturasmodernas.microservices.order.repository;

import com.josepillado.arquitecturasmodernas.microservices.order.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
