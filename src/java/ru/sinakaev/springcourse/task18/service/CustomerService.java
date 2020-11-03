package ru.sinakaev.springcourse.task18.service;

import ru.sinakaev.springcourse.task18.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Customer getCustomer(int customerId);
}

