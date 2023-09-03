package com.josepillado.arquitecturasmodernas.microservices.order.repository;

import com.josepillado.arquitecturasmodernas.microservices.order.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

}
