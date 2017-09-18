package MVC.Controller.impl;

import MVC.Controller.Controller;
import MVC.Model.Model;
import MVC.View.View;

/**
 * Created by mbo on 12.09.2017.
 */
public class TeacherController  implements Controller {
    private Model model;
    private View view;

    public TeacherController(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        model.setName(name + " Durchgefallen");
    }

    public String getName(){
        return model.getName();
    }

    public void setRollNo(String rollNo){
        model.setRollNo(rollNo + "<-- ungültige Nummer");
    }

    public String getRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
