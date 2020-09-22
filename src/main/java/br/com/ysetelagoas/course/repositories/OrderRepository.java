package br.com.ysetelagoas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ysetelagoas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
