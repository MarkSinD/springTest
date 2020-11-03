package ru.sinakaev.springcourse.task6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping("/")
    public String startPage(){
        return "main-menu";
    }
}
