package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
public class Product {
	@Id // unique and not null
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull(message = "Productname is mandatory")
	private String productName;

	@NotNull(message = "Please provide the description")
	private String description;

	@Min(value = 0, message = "Minimum quantity must be 0")
	private int quantity;

	@Min(value = 0, message = "Minimum quantity must be 0")
	private double price;
	
	@ManyToOne
	private Category category;
	
	@Transient // non persistent
	private MultipartFile image;// no column for image in product table

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public static Product getProduct(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	

}