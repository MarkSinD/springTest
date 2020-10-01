package ru.sinakaev.springcourse;

public class TestBean {
    private String string;


    TestBean(String string){
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
