package com.cordeiro_cesar.product_catalog_api.controllers;

import com.cordeiro_cesar.product_catalog_api.model.Product;
import com.cordeiro_cesar.product_catalog_api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository repository;

@GetMapping

    public ResponseEntity getAll(){
        List<Product> listproducts = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listproducts);
    }
}
