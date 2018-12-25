package com.niit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;



@Entity
@Component
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String categoryname;
@OneToMany(mappedBy="category")  //category refers to property name in Product 
private List<Product> products;

public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
public int getId() {
	return id;
}
public void setId(int id) {
	System.out.println("Setter method in category for property ID");
	this.id = id;
}
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}
@Override
public String toString() {
	return categoryname ;
}

}
