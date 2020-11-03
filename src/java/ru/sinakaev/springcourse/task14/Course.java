package ru.sinakaev.springcourse.task14;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    private List<Review> reviewList;

    public Course(){

    }

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void add(Review review){
        if(reviewList == null)
            reviewList = new ArrayList<>();

        reviewList.add(review);
        review.setCourse(this);
    }

    @Override
    public String toString() {
        return "\nCourse = \n" +
                "\nid = " + id +
                "\ntitle = " + title +
                "\n**************************";
    }
}
