package com.bikashghadai.springboot.curddemo.dao;

import java.util.List;

import com.bikashghadai.springboot.curddemo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> findAll();
public Customer findById(int theId);
public void save(Customer thecustomer);
public void deleteBYId(int theId);

}
