package com.stark.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.stark.inventory.entities.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{
	Product getReferenceById(@Param("pId") int pId);
}
