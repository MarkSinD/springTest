package ru.sinakaev.springcourse.task11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TestHiber {
    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("WEB-INF/hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // CREATE
            // create a student object
            System.out.println("Creating new student object...");
            Student tempStudent = new Student("Mark", "Ron", "mark@gmail.com");

            // start a transaction
            session.beginTransaction();
            // save the student object
            System.out.println("Saving the student...");

            session.save(tempStudent);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");


            // READ
            System.out.println("Saved student. Generated id: " + tempStudent.getId());

            // now get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();
            // retrieve student based on the id: primary key
            System.out.println("\nGetting student with id: " + tempStudent.getId());

            Student myStudent = session.get(Student.class, tempStudent.getId());

            System.out.println("Get complete: " + myStudent);

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");









            session = factory.getCurrentSession();
            // start a transaction
            session.beginTransaction();

            // query students
            List<Student> theStudents = session.createQuery("from Student").getResultList();

            // display the students
            System.out.println(theStudents);

            // query students: lastName='Doe'
            theStudents = session.createQuery("from Student s where s.lastName='Doe'").getResultList();

            // display the students
            System.out.println("\n\nStudents who have last name of Doe");
            System.out.println(theStudents);

            // query students: lastName='Doe' OR firstName='Daffy'
            theStudents =
                    session.createQuery("from Student s where"
                            + " s.lastName='Doe' OR s.firstName='Daffy'").getResultList();

            System.out.println("\n\nStudents who have last name of Doe OR first name Daffy");
            System.out.println(theStudents);

            // query students where email LIKE '%gmail.com'
            theStudents = session.createQuery("from Student s where"
                    + " s.email LIKE '%gmail.com'").getResultList();

            System.out.println("\n\nStudents whose email ends with gmail.com");
            System.out.println(theStudents);


            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");




        }
        finally {
            factory.close();
        }

    }
}
