package MVC.Model.impl;

import MVC.Model.Model;

import java.util.List;

/**
 * Created by mbo on 12.09.2017.
 */
public class Student implements Model{
    private String rollNo;
    private String name;

    public Student(String name, String rollNo) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isTeacher() {
        return false;
    }
}