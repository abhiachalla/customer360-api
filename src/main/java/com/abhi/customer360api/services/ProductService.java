package com.abhi.customer360api.services;

import com.abhi.customer360api.model.Product;

public interface ProductService {
  Product createProduct(Product product);

  Product getProductById(Long id);
}
