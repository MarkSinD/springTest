package ru.sinakaev.springcourse.task5;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/parent")
public class SpringController {

    @GetMapping("/show")
    public String showForm(){
        return "task1-5/helloworld-form";
    }

    @GetMapping("/processForm")
    public String showResult(){
        return "task1-5/helloworld";
    }

    @GetMapping("/")
    public String showStartPage(){
        return "task7/main-menu";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude1(HttpServletRequest request, Model model) {


        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo! " + theName;
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShoutDude2(@RequestParam("studentName") String name, Model model) {

        name = name.toUpperCase();
        String result = "Yo! " + name;
        model.addAttribute("message", result);

        return "helloworld";
    }
}
