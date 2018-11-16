package com.niit.Dao;


import java.util.List;

import com.niit.model.Category;
import com.niit.model.Product;

public interface ProductDao 
{
	public void addProduct(Product product);
	
	public void updateProduct(Product product);
	Product getProduct(int id);
	public Product deleteProduct(int id);
	List<Product> getAllProducts();
	List<Category> getAllCategories();
	
		
	
}