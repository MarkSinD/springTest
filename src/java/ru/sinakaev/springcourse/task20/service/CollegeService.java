package ru.sinakaev.springcourse.task20.service;

import ru.sinakaev.springcourse.task20.entity.*;

import java.util.List;

public interface CollegeService {
    List<Instructor> getInstructors();
    List<InstructorDetail> getInstructorDetails();
    List<Course> getCourses();
    List<Review> getReviews();
    List<Student> getStudents();

    void deleteInstructor(int theId);
    void deleteInstructorDetail(int theId);
    void deleteCourse(int theId);
    void deleteReview(int theId);
    void deleteStudent(int theId);

    void saveInstructor(Instructor instructor);
    void saveInstructorDetail(InstructorDetail instructorDetail);
    void saveCourse(Course course);
    void saveReview(Review review);
    void saveStudent(Student student);
}
