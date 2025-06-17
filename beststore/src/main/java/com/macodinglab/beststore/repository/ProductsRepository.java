package com.macodinglab.beststore.repository;

import com.macodinglab.beststore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
