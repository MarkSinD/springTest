package ru.sinakaev.springcourse.task20;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sinakaev.springcourse.task20.entity.*;


public class TestManyToMany {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        int index = 11;
        try{
            session.beginTransaction();

            Instructor instructor = session.get(Instructor.class, index);
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, 5);

            instructorDetail.setInstructor(instructor);

            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
            session.close();
        }
    }
}
