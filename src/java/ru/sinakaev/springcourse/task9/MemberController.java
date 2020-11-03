package ru.sinakaev.springcourse.task9;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sinakaev.springcourse.task6.Student;

@Controller
@RequestMapping("/member")
public class MemberController {

    @RequestMapping("/memberForm")
    public String firstPage(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "member-form";
    }


}
