package MVC.View.impl;

import MVC.View.View;

/**
 * Created by mbo on 12.09.2017.
 */
public class StudentView implements View {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
