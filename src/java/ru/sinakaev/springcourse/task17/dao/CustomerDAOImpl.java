package ru.sinakaev.springcourse.task17.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.sinakaev.springcourse.task17.entity.Customer;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery("from Customer", Customer.class);
        List<Customer> customerList = query.getResultList();

        for(int i = 0; i < customerList.size(); i++){
            System.out.println("**********             **********             **********");
            System.out.println(customerList.get(i).getId());
            System.out.println(customerList.get(i).getFirstName());
            System.out.println(customerList.get(i).getLastName());
            System.out.println(customerList.get(i).getEmail());
        }
        System.out.println("**********             **********             **********");


        return customerList;
    }

    @Override
    public void saveCustomer(Customer theCustomer) {
        Session session = sessionFactory.getCurrentSession();
        session.save(theCustomer);
        System.out.println("**********             **********             **********");
        System.out.println("Save : ");
        System.out.println(theCustomer.getFirstName());
    }
}
