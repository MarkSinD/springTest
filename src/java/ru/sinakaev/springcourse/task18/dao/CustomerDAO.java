package ru.sinakaev.springcourse.task18.dao;

import ru.sinakaev.springcourse.task18.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

}
