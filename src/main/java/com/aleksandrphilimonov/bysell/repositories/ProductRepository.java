package com.aleksandrphilimonov.bysell.repositories;

import com.aleksandrphilimonov.bysell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByTitle(String title);


}
