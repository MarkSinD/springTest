package ru.sinakaev.springcourse.task6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm1(@ModelAttribute("student") Student theStudent) {


        System.out.println("theStudent: " + theStudent.getFirstName()
                + " " + theStudent.getLastName());

        for(int i = 0; i < theStudent.getOperatingSystems().length; i++){
            System.out.println(theStudent.getOperatingSystems()[i]);
        }

        return "student-confirmation";
    }

}
