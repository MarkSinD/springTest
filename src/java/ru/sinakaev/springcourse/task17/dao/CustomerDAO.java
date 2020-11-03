package ru.sinakaev.springcourse.task17.dao;

import ru.sinakaev.springcourse.task17.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

}
