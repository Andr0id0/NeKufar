package com.example.NeKufar.services;


import com.example.NeKufar.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "Ps 5", "new", 67000, "Minsk", "Niger"));

        products.add(new Product(++ID,"Ps 4", "bu", 30000, "Minsk", "white"));

    }

    public List<Product> listProducts() {return products;}

    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products)
            if (product.getId().equals(id)) return product;
        return null;
    }
}
