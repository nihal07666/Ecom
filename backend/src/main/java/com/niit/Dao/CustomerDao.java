package com.niit.Dao;

import com.niit.model.Customer;

public interface CustomerDao {
	void registerCustomer(Customer customer);
	boolean isEmailUnique(String email);

}
