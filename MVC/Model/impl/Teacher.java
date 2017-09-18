package MVC.Model.impl;

import MVC.Model.Model;

import java.util.List;

/**
 * Created by mbo on 18.09.2017.
 */
public class Teacher implements Model {

    private String rollNo;
    private String name;

    @Override
    public String getRollNo() {
        return rollNo;
    }

    @Override
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isTeacher() {
        return true;
    }
}
