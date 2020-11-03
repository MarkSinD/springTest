package ru.sinakaev.springcourse.task9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping("/")
    public String startFirstPage(){
        return "main-menu";
    }

}
