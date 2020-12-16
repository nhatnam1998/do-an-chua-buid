package epu.aeshop.service;

import java.util.List;

import epu.aeshop.entity.Category;
import epu.aeshop.entity.Product;
import epu.aeshop.entity.Seller;

public interface ProductService {
    List<Product> getAll();

    Product findById(Long id);

    Product save(Product product);

    void delete(Product product);

    List<Product> getProductsByCategory(Category category);

    List<Product> getProductsBySeller(Seller seller);

    List<Product> getProductsByName(String name);
}
