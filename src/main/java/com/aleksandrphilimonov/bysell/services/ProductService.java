package com.aleksandrphilimonov.bysell.services;

import com.aleksandrphilimonov.bysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "PlayStation 5", "Simple description", 58000, "Moscow", "Tomas"));
        products.add(new Product(++ID, "Iphone 12", "Simple description 2", 36000, "Minsk", "Ptric"));
    }

    public List<Product> listProducts() {
        return products;
    }

    public void saveProducts(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProducts(long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
