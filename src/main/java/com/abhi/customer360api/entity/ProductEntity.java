package com.abhi.customer360api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Products")
public class ProductEntity {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long productID;
  private String productName;
  private String productOverview;
  private String productFeatures;
  private String productFAQ;
  private String productImageURL;
}
