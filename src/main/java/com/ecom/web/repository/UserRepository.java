package com.ecom.web.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecom.web.entity.Users;

public interface UserRepository extends JpaRepository<Users, String>{


	
}
