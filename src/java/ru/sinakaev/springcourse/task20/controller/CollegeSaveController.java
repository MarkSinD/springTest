package ru.sinakaev.springcourse.task20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sinakaev.springcourse.task20.entity.*;
import ru.sinakaev.springcourse.task20.service.CollegeService;

@Controller
@RequestMapping("/save")
public class CollegeSaveController {

    @Autowired
    CollegeService collegeService;

    @RequestMapping("/saveInstructor")
    public String saveInstructor(@ModelAttribute("instructor") Instructor instructor){
        collegeService.saveInstructor(instructor);
        return "redirect:/show/showInstructorsList";
    }

    @RequestMapping("/saveInstructorDetail")
    public String saveInstructorDetail(@ModelAttribute("instructorDetail") InstructorDetail instructorDetail){
        System.out.println("Было");
        System.out.println(instructorDetail.getHobby());
        collegeService.saveInstructorDetail(instructorDetail);
        return "redirect:/show/showInstructorDetailsList";
    }

    @RequestMapping("/saveCourse")
    public String saveCourse(@ModelAttribute("course") Course course){
        collegeService.saveCourse(course);
        return "redirect:/show/showCourseList";
    }

    @RequestMapping("/saveReview")
    public String saveReview(@ModelAttribute("review") Review review){
        collegeService.saveReview(review);
        return "redirect:/show/showInstructorsList";
    }

    @RequestMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("instructor") Student student){
        collegeService.saveStudent(student);
        return "redirect:/show/showInstructorsList";
    }
}
