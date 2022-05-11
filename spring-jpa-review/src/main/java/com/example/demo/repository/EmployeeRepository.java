package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public class interface EmployeeRepository extends JpaRepository<Employee ,Long>{
    
}
