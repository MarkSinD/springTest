package ru.sinakaev.springcourse.task7;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/phone")
public class PhoneController {

    @RequestMapping("/form")
    public String inputData(Model theModel){
        Phone phone = new Phone();
        theModel.addAttribute("phone", phone);
        return "task7/phone-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("phone") Phone phone){
        System.out.println("Cell phone : " + phone.getName() + " " + phone.getModel());
        return "task7/phone-confirmation";
    }

    @RequestMapping("/")
    public String startPage(){
        return "task7/main-menu";
    }
}
