package com.customermanagement.service;

import java.util.List;

import com.customermanagement.model.Customer;


public interface CustomerService {

	
	public Customer saveCustomer(Customer customer);
	public Customer findCustomerById(Integer customerId);
	public List<Customer> findAllCustomers();
	public Customer deleteCustomer(Integer customerId);

}
	
