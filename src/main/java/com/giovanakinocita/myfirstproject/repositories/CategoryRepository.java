package com.giovanakinocita.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giovanakinocita.myfirstproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}