package ru.sinakaev.springcourse.task8;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartPage {

    @RequestMapping("/")
    String startPage(){
        return "startpage";
    }
}
