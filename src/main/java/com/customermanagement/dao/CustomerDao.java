package com.customermanagement.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.customermanagement.model.Customer;

@Repository

public class CustomerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Customer saveCustomer(Customer customer) {
		hibernateTemplate.saveOrUpdate(customer);
		return customer;
	}
	
	public Customer getCustomerById(Integer customerId) {
		return hibernateTemplate.get(Customer.class, customerId);
	}
	
	public List<Customer> getAllCustomers() {
		return hibernateTemplate.loadAll(Customer.class);
	}
	
	@Transactional
	public Customer deleteCustomerById(Integer customerId) {
		Customer customer = hibernateTemplate.get(Customer.class, customerId);
		hibernateTemplate.delete(customer);
		return customer;
	}
}
