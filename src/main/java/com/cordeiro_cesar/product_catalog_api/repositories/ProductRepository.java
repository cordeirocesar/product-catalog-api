package com.cordeiro_cesar.product_catalog_api.repositories;

import com.cordeiro_cesar.product_catalog_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

