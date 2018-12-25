package com.niit.service;

import java.util.List;

import com.niit.model.CartItem;
import com.niit.model.CustomerOrder;

public interface CartItemService {

	void createCustomerOrder(CustomerOrder customerOrder);

	List<CartItem> getCart(String email);

	void addToCart(CartItem cartItem);

	void removeCartItem(int cartItemId);

}
