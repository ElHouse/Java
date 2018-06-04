package com.elcanto.mockito.TestMockitoMVC.repository;


import com.elcanto.mockito.TestMockitoMVC.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository  extends JpaRepository  <User, Integer> {
}
