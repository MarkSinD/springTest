package ru.sinakaev.springcourse.task19.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sinakaev.springcourse.task19.entity.Customer;
import ru.sinakaev.springcourse.task19.service.CustomerService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/list")
    public String getListCustomers(Model theModel){
        List<Customer> customerList = customerService.getCustomers();
        theModel.addAttribute("customers", customerList);
        return "l";
    }

    @RequestMapping("/showFormForAdd")
    public String getShowFormForAdd(Model theModel){
        Customer customer = new Customer();
        theModel.addAttribute("customer", customer);
        return "f";
    }

    @RequestMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @RequestMapping("/showFormForUpdate")
    public String getShowFormForUpdate(@RequestParam("customerId") int id, Model theModel){
        Customer customer = customerService.getCustomer(id);
        theModel.addAttribute("customer", customer);
        return "f";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("customerId")int id){
        customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }

}
