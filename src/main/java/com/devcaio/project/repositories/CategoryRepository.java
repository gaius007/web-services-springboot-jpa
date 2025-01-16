package com.devcaio.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcaio.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
