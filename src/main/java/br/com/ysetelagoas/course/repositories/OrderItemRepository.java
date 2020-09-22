package br.com.ysetelagoas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ysetelagoas.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
