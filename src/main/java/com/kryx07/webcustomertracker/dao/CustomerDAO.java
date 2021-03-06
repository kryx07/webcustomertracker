package com.kryx07.webcustomertracker.dao;

import com.kryx07.webcustomertracker.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerDAO {

public List<Customer> getCustomers();
public void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void deleteCustomer(int id);
}
