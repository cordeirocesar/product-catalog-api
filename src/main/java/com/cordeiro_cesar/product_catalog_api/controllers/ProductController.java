package com.cordeiro_cesar.product_catalog_api.controllers;

import com.cordeiro_cesar.product_catalog_api.dtos.ProductsDto;
import com.cordeiro_cesar.product_catalog_api.model.Product;
import com.cordeiro_cesar.product_catalog_api.repositories.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity save(@RequestBody ProductsDto dto){

    var product = new Product();
    BeanUtils.copyProperties(dto,product);

    return   ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));
    }
}
