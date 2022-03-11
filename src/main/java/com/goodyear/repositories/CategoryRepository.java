package com.goodyear.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodyear.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
