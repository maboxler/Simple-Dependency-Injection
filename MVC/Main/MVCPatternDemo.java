package MVC.Main;

import MVC.Controller.Controller;
import MVC.Controller.ControllerInjector;
import MVC.Controller.impl.StudentControllerInjector;
import MVC.Model.Model;
import MVC.Model.impl.Student;
import MVC.View.View;
import MVC.View.impl.StudentView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbo on 12.09.2017.
 */
public class MVCPatternDemo {
    public static void main(String[] args) {

        ControllerInjector injector = new StudentControllerInjector();
        Controller controller;
        View view = new StudentView();

        List<Model> studenList = new ArrayList<>();
        studenList.add(new Student("Lars", "001"));
        studenList.add(new Student("Peter", "002"));
        studenList.add(new Student("Dieter", "003"));
        studenList.add(new Student("Rainer", "004"));

        for (Model student : studenList) {
            controller = injector.getController(student, view);
            controller.updateView();
        }
    }
}