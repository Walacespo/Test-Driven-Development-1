package com.devsuperior.bds01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds01.entities.Department;

public interface DepartmentsRepository extends JpaRepository<Department, Long> {

}
