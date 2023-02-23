package com.niit.bej.master.challenge.repository;

import com.niit.bej.master.challenge.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
