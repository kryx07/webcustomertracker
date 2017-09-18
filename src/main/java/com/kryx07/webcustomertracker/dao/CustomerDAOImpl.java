package com.kryx07.webcustomertracker.dao;

import com.kryx07.webcustomertracker.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {


    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        List<Customer> customers = session
                .createQuery("from Customer", Customer.class)
                .getResultList();

        return customers;
    }

    @Override
    @Transactional
    public void addCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.save(customer);
    }
}
