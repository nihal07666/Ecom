package com.niit.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Dao.CartItemDao;
import com.niit.model.CartItem;
import com.niit.model.CustomerOrder;
import com.niit.service.CartItemService;
@Service
public class CartServiceImpl implements CartItemService{
	@Autowired
	private CartItemDao cartItemDao;
	

	public void createCustomerOrder(CustomerOrder customerOrder) {
		cartItemDao.createCustomerOrder(customerOrder);
		
		
	}

	public List<CartItem> getCart(String email) {
		// TODO Auto-generated method stub
		List<CartItem> list = cartItemDao.getCart(email);
		return list;
	}

	public void addToCart(CartItem cartItem) {
		// TODO Auto-generated method stub
		cartItemDao.addToCart(cartItem);
		
	}

	public void removeCartItem(int cartItemId) {
		// TODO Auto-generated method stub
		cartItemDao.removeCartItem(cartItemId);
		
	}

}
