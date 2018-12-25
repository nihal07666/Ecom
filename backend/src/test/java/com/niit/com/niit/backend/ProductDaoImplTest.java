package com.niit.com.niit.backend;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DBConfiguration.DbConfig;
import com.niit.Dao.ProductDao;
import com.niit.DaoImpl.ProductDaoImpl;
import com.niit.ServiceImpl.ProductServiceImpl;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.service.ProductService;

public class ProductDaoImplTest {
private static AnnotationConfigApplicationContext config;
	
	@Autowired
	private static ProductDao productDao;
	@Autowired
	private static Product product;
	
	@BeforeClass
	public static void init() {
	 config=new AnnotationConfigApplicationContext(DbConfig.class,ProductDaoImpl.class,ProductServiceImpl.class);
		config.scan("com.niit.*");
		//config.refresh();
	 product=(Product)config.getBean("product");
	 productDao=(ProductDao)config.getBean("ProductDao");
	ProductService productService=(ProductService)config.getBean("ProductService");
	}

	@Test
	public void testProductDaoImpl() {
		fail("Not yet implemented");
		
	}

	@Test
	public void testAddProduct() {
		product.setDescription("Mobile Phone");
		product.setProductName("Redmi note 5 pro");
		product.setPrice(15000);
		product.setQuantity(15);
		productDao.addProduct(product);
		assertTrue(product.getId()>0);
		
	}

	@Test
	public void testUpdateProduct() {
		Product product=productDao.getProduct(2);
		product.setPrice(75);
		productDao.updateProduct(product);
		assertTrue(product.getPrice()==75);
	}

	@Test
	public void testGetProduct() {
		Product ap1=productDao.getProduct(1);
		Product ap2=productDao.getProduct(45);
		assertNotNull(ap1);
		assertNull(ap2);
	}

	@Test
	public void testDeleteProduct() {
		productDao.deleteProduct(39);
		Product product=productDao.getProduct(39);
		assertNull(product);
	}

	@Test
	public void testGetAllProducts() {
		List<Product> products=productDao.getAllProducts();
		assertFalse(products.isEmpty());
		assertTrue(products.size()==4);
	}
	
	@Test
	public void testGetAllProductsC() {
		List<Category> products=productDao.getAllCategories();
		assertFalse(products.isEmpty());
		assertTrue(products.size()==1);
	}

}
