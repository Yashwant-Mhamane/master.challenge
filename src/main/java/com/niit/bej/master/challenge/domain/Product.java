package com.niit.bej.master.challenge.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private long productId;
    private String productName;
    private String manufacturer;



}
