package com.abhi.customer360api.controller;

import com.abhi.customer360api.model.Product;
import com.abhi.customer360api.services.ProductService;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/salesforce/products")
@CrossOrigin(origins = "*")
public class ProductController {

  private final ProductService productService;


  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @PostMapping("/product")
  public Product createProduct(@RequestBody Product product) {
    return productService.createProduct(product);
  }


  @GetMapping("/product/{id}")
  public ResponseEntity<Product> getProductById(@PathVariable Long id){
    Product product = null;
    product = productService.getProductById(id);
    return ResponseEntity.ok(product);
  }

  @GetMapping("/")
  public String getHello(){
    return "Hello";
  }
}
