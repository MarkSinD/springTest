package ru.sinakaev.springcourse.task17.service;

import ru.sinakaev.springcourse.task17.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

}
