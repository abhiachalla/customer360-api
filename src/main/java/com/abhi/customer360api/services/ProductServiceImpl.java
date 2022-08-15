package com.abhi.customer360api.services;

import com.abhi.customer360api.entity.ProductEntity;
import com.abhi.customer360api.model.Product;
import com.abhi.customer360api.repository.ProductRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  private ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Product createProduct(Product product) {
    ProductEntity productEntity = new ProductEntity();
    BeanUtils.copyProperties(product, productEntity);
    productRepository.save(productEntity);
    return product;
  }

  @Override
  public Product getProductById(Long id) {
    ProductEntity productEntity = productRepository.findById(id).get();
    Product product = new Product();
    BeanUtils.copyProperties(productEntity, product);
    return product;
  }
}
