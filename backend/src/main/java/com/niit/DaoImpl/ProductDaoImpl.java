package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.ProductDao;
import com.niit.model.Category;
import com.niit.model.Product;

@Repository(value="ProductDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	public ProductDaoImpl()
	{
		System.out.println("ProductDaoImpl bean is created");
	}

	public void addProduct(Product product) {
		//database operation -insert product details in product table
		//	System.out.println("Before inserting product " + product.getId());
			Session session=sessionFactory.getCurrentSession();
			session.save(product);//permanently store the product object in database, session.sav
			//System.out.println("After inserting product " + product.getId());
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.update(product);
	}

	public Product getProduct(int id) {
	Session session=sessionFactory.getCurrentSession();
	Product product=(Product)session.get(Product.class,id);
	return product;
	}

	public Product deleteProduct(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,id);
		session.delete(product);
		return product;
		
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Product");
		List<Product>products=query.list();
		return products;
	}

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		List<Category>products=query.list();
		for(Category c:products)
		{
			System.out.println(" from dao"+c.getCategoryname());
		}
		return products;
	}

}
