package ru.sinakaev.springcourse.task13;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TestManyToOne {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("main/webapp/WEB-INF/spring-mvc-crud-demo-servlet").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        int theId = 5;
        try{

            session.beginTransaction();

            Query<Instructor> query =
                    session.createQuery("select i from Instructor i "
                                    + "JOIN FETCH i.courses "
                                    + "where i.id=:theInstructorId",
                            Instructor.class);

            // set parameter on query
            query.setParameter("theInstructorId", theId);

            // execute query and get instructor
            Instructor tempInstructor = query.getSingleResult();

            System.out.println("luv2code: Instructor: " + tempInstructor);

        }catch (Exception exp){
            exp.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();
        }

    }
}
