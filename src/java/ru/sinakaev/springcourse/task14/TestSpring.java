package ru.sinakaev.springcourse.task14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSpring {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("WEB-INF/hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{
            session.beginTransaction();

            Instructor instructor = new Instructor("Mark", "Sinakaev", "marksinakaev@gmail.com");
            InstructorDetail instructorDetail = new InstructorDetail("/coding", "Coding is live");
            Course course1 = new Course("C++");
            Course course2 = new Course("Java");
            Course course3 = new Course("SQL");
            Review review1 = new Review("begginer");
            Review review2 = new Review("starter");
            Review review3 = new Review("begginer");

            instructor.setInstructorDetail(instructorDetail);
            instructor.add(course1);
            instructor.add(course2);
            instructor.add(course3);

            course1.add(review1);
            course1.add(review2);
            course1.add(review3);

            session.save(instructor);
            session.save(course1);
            session.save(course2);
            session.save(course3);
            session.save(review1);
            session.save(review2);
            session.save(review3);

            System.out.println(instructor.toString());
            System.out.println(instructor.getInstructorDetail().toString());
            System.out.println(instructor.getCourseList());
            System.out.println(instructor.getCourseList().get(0));

            /*for(int i = 0; i <= 6; i++){
                Instructor instructorTemp = session.get(Instructor.class, i);
                if (instructorTemp != null) {
                    System.out.println("Deleting: " + instructorTemp);
                    session.delete(instructorTemp);
                }
            }*/

            session.getTransaction().commit();

        }finally {
            session.close();
            sessionFactory.close();
        }

    }
}
