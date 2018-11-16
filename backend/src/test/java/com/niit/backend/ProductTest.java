package com.niit.backend;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DBConfiguration.DbConfig;
import com.niit.Dao.CustomerDao;
import com.niit.Dao.ProductDao;
import com.niit.DaoImpl.ProductDaoImpl;
import com.niit.ServiceImpl.ProductServiceImpl;
import com.niit.model.Authorities;
import com.niit.model.BillingAddress;
import com.niit.model.Customer;
import com.niit.model.Product;
import com.niit.model.ShippingAddress;
import com.niit.model.User;
import com.niit.service.ProductService;


public class ProductTest {
public static void main(String args[])
{
	AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(DbConfig.class,ProductDaoImpl.class,ProductServiceImpl.class);
	ProductService productService=(ProductService)config.getBean("ProductService");
	List<Product>products=productService.getAllProducts();
	for(Product p:products)
		System.out.println(p.getId()+"      "+p.getDescription()+"     "+p.getProductName()+"      "+p.getPrice()+"     "+p.getQuantity());
	config.scan("com.niit.*");
	//config.refresh();
	
	
	Product product=(Product)config.getBean("product");
	ProductDao productDao=(ProductDao)config.getBean("ProductDao");
	
	Authorities authorities=(Authorities)config.getBean("authorities");
	
	Customer customer=(Customer)config.getBean("customer");
	CustomerDao customerDao=(CustomerDao)config.getBean("userDao");
	
	User user=(User)config.getBean("user");
	
	BillingAddress billingAddress=(BillingAddress)config.getBean("billingAddress");
	
	ShippingAddress shippingAddress=(ShippingAddress)config.getBean("shippingAddress");
	
	
	//sProductService productService=(ProductService)config.getBean("ProductService");
	product.setDescription("blac pen");
	product.setProductName("parker");
	product.setPrice(200);
	product.setQuantity(10);
	productDao.addProduct(product);
	Product product1=productService.getProduct(1);
	System.out.println(product1.getProductName());
	System.out.println(product1.getDescription());
	System.out.println(product1.getPrice());
	System.out.println(product1.getQuantity());
	
	
	//product=productService.deleteProduct(4);
	

	user.setAuthorities(authorities);
	user.setEmail("abcde@gmail.com");
	user.setEnabled(true);
	user.setPassword("1234abc");
	authorities.setRole("user");
	authorities.setUser(user);
	
	billingAddress.setApartmentnumber("c8");
	
	billingAddress.setCity("Bengaluru");
	billingAddress.setCountry("India");
	billingAddress.setState("Karnataka");
	billingAddress.setStreetname("Malleshwaram");
	billingAddress.setZipcode("560055");
	
	shippingAddress.setApartmentnumber("24");
	shippingAddress.setCity("Bengaluru");
	shippingAddress.setCountry("India");
	
	shippingAddress.setState("Karnataka");
	shippingAddress.setStreetname("AnandNagar");
	shippingAddress.setZipcode("560032");

	customer.setBillingaddress(billingAddress);
	customer.setFirstname("jkk");
	customer.setLastname("uuuu");
	customer.setShippingaddress(shippingAddress);
	customer.setUser(user);
	customer.setPhonenumber("567788");
	customerDao.registerCustomer(customer);
	
	
	
}
}

