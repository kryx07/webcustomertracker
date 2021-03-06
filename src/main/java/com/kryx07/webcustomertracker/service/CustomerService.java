package com.kryx07.webcustomertracker.service;


import com.kryx07.webcustomertracker.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();
    public Customer getCustomer(int id);
    public void addCustomer(Customer customer);

    void deleteCustomer(int id);
}
