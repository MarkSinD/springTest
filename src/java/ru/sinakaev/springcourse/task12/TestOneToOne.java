package ru.sinakaev.springcourse.task12;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("WEB-INF/hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {


            session.beginTransaction();

            int theId = 1;
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, theId);

            System.out.println("Found instructor : " + instructorDetail);
            System.out.println("The associated instructor: " + instructorDetail.getInstructor());

            session.getTransaction().commit();
        }
        catch (Exception exp){
            exp.printStackTrace();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
