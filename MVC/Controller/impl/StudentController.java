package MVC.Controller.impl;

import MVC.Controller.Controller;
import MVC.Model.Model;
import MVC.Model.impl.Student;
import MVC.View.View;
import MVC.View.impl.StudentView;

/**
 * Created by mbo on 12.09.2017.
 */
public class StudentController  implements Controller {
    private Model model;
    private View view;

    public StudentController(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        model.setName(name);
    }

    public String getName(){
        return model.getName();
    }

    public void setRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getRollNo(){
        return model.getRollNo();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
