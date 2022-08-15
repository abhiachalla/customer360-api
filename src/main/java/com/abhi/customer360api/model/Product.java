package com.abhi.customer360api.model;

import lombok.Data;

@Data
public class Product {
  private long productID;
  private String productName;
  private String productOverview;
  private String productFeatures;
  private String productFAQ;
  private String productImageURL;
}
