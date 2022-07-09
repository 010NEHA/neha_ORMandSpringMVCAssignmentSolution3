package com.customermanagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customermanagement.dao.CustomerDao;
import com.customermanagement.model.Customer;


@Service

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer saveCustomer(Customer customer) {
		return this.customerDao.saveCustomer(customer);
	}

	@Override
	public Customer findCustomerById(Integer customerId) {
		return this.customerDao.getCustomerById(customerId);
	}

	@Override
	public List<Customer> findAllCustomers() {
		return this.customerDao.getAllCustomers();
	}

	@Override
	public Customer deleteCustomer(Integer customerId) {
		return this.customerDao.deleteCustomerById(customerId);
	}

}
