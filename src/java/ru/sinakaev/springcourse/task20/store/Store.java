package ru.sinakaev.springcourse.task20.store;

import ru.sinakaev.springcourse.task20.entity.Instructor;

import java.util.LinkedHashMap;

public class Store {
    private LinkedHashMap<String, Instructor> instructorOptions;

    public Store(LinkedHashMap<String, Instructor> instructorOptions) {
        this.instructorOptions = instructorOptions;
    }

    public LinkedHashMap<String, Instructor> getInstructorOptions() {
        return instructorOptions;
    }

    public void setInstructorOptions(LinkedHashMap<String, Instructor> instructorOptions) {
        this.instructorOptions = instructorOptions;
    }
}
