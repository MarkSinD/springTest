package ru.sinakaev.springcourse.task17.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sinakaev.springcourse.task17.entity.Customer;
import ru.sinakaev.springcourse.task17.service.CustomerService;

import java.util.List;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    // need to inject our customer service
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {

        List<Customer> theCustomers = customerService.getCustomers();
        theModel.addAttribute("customers", theCustomers);
        return "instructors-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        Customer customer = new Customer();
        theModel.addAttribute("customer", customer);

        return "instructors-form";
    }

    @PostMapping("/saveCustomer")
    public String backToList(@ModelAttribute("customer") Customer theCustomer){

        customerService.saveCustomer(theCustomer);
        return "redirect:/customer/list";
    }
}

