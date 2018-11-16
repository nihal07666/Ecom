package com.niit.service;

import com.niit.model.Customer;

public interface CustomerService {
	void registerCustomer(Customer customer);
    boolean isEmailUnique(String email);


}