package ru.sinakaev.springcourse.task20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sinakaev.springcourse.task20.entity.*;
import ru.sinakaev.springcourse.task20.service.CollegeService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/show")
public class CollegeShowListController {

    @Autowired
    CollegeService collegeService;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showInstructorsList")
    public String getInstructorsList(Model theModel){
        List<Instructor> instructor = collegeService.getInstructors();
        theModel.addAttribute("instructors", instructor);
        System.out.println(theModel.getAttribute("instructor"));
        return "instructors-list";
    }

    @RequestMapping("/showInstructorsListE")
    public String getInstructorsList(@Valid @ModelAttribute("instructor") Instructor theInstructor,
                                     BindingResult theBindingResult){

        System.out.println("Last name: |" + theInstructor.getFirst_name() + "|");

        if (theBindingResult.hasErrors())
            return "instructors-form";

        else {
            return "instructors-list";
        }
    }

    @RequestMapping("/showInstructorDetailsList")
    public String getInstructorDetailsList(Model theModel){
        List<InstructorDetail> instructorDetails = collegeService.getInstructorDetails();
        theModel.addAttribute("instructorDetails", instructorDetails);
        System.out.println("Instructor Details");
        return "instructor-details-list";
    }

    @RequestMapping("/showCourseList")
    public String getCourseList(Model theModel){
        List<Course> courses = collegeService.getCourses();
        theModel.addAttribute("courses", courses);
        System.out.println("Course List");
        return "courses-list";
    }

    @RequestMapping("/showReviewsList")
    public String getReviewsList(Model theModel){
        List<Review> reviews = collegeService.getReviews();
        theModel.addAttribute("reviews", reviews);
        return "reviews-list";
    }

    @RequestMapping("/showStudentsList")
    public String getStudentsList(Model theModel){
        List<Student> students = collegeService.getStudents();
        theModel.addAttribute("students", students);
        return "students-list";
    }
}
