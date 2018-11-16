package com.niit.service;

import java.util.List;

import com.niit.model.Category;
import com.niit.model.Product;

public interface ProductService {
public void addProduct(Product product);
public void updateProduct(Product product);
Product getProduct(int id);
public Product deleteProduct(int id);
List<Product> getAllProducts();
public List<Category> getAllCategories();
}
