package com.kryx07.webcustomertracker.dao;

import com.kryx07.webcustomertracker.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerDAO {

public List<Customer> getCustomers();
public void addCustomer(Customer customer);
}
