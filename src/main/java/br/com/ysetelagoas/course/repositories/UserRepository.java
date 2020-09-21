package br.com.ysetelagoas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ysetelagoas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
