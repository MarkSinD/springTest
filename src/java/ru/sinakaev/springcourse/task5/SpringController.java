package ru.sinakaev.springcourse.task5;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

    @GetMapping("/show")
    public String showForm(){
        return "helloworld-form";
    }

    @GetMapping("/a")
    public String showResult(){
        return "main-menu";
    }
}
