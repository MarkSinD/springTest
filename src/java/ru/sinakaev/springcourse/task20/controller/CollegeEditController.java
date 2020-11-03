package ru.sinakaev.springcourse.task20.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sinakaev.springcourse.task20.entity.*;
import ru.sinakaev.springcourse.task20.service.CollegeService;

import java.util.LinkedHashMap;
import java.util.List;

@Controller
@RequestMapping("/edit")
public class CollegeEditController {

    @Autowired
    CollegeService collegeService;

    @RequestMapping("/showInstructorFormAdd")
    public String getInstructorFormAdd(Model theModel){
        Instructor instructor = new Instructor();
        theModel.addAttribute("instructor", instructor);
        return "instructors-form";
    }

    @RequestMapping("/showInstructorDetailFormAdd")
    public String getInstructorDetailFormAdd(Model theModel){
        InstructorDetail instructorDetail = new InstructorDetail();
        List<Instructor> instructorList = collegeService.getInstructors();

        LinkedHashMap<String, String> countryOption = new LinkedHashMap<>();
        countryOption.put("DE", "Germany");
        countryOption.put("FR", "France");
        countryOption.put("IN", "India");
        countryOption.put("BR", "Brazil");

        theModel.addAttribute("instructorList", instructorList);
        theModel.addAttribute("instructorDetail", instructorDetail);
        theModel.addAttribute("countryOption", countryOption);

        return "instructor-details-form";
    }

    @RequestMapping("/showCourseFormAdd")
    public String getCourseFormAdd(Model theModel){
        Course course = new Course();
        theModel.addAttribute("course", course);
        return "courses-form";
    }

    @RequestMapping("/showReviewsFormAdd")
    public String getReviewsAdd(Model theModel){
        Review review = new Review();
        theModel.addAttribute("review", review);
        return "reviews-form";
    }

    @RequestMapping("/showStudentsFormAdd")
    public String getStudentsFormAdd(Model theModel){
        Student student = new Student();
        theModel.addAttribute("student", student);
        return "students-form";
    }
}
