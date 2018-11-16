package com.niit.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Dao.CustomerDao;
import com.niit.model.Customer;
import com.niit.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
	private CustomerDao customerDao;

	public void registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.registerCustomer(customer);
	}

	public boolean isEmailUnique(String email) {
		// TODO Auto-generated method stub
		return customerDao.isEmailUnique(email);
	}

}
