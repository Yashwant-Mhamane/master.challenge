package com.niit.bej.master.challenge.repository;

import com.niit.bej.master.challenge.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
