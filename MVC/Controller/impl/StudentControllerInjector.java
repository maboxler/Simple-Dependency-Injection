package MVC.Controller.impl;

import MVC.Controller.ControllerInjector;
import MVC.Model.Model;
import MVC.View.View;

/**
 * Created by mbo on 12.09.2017.
 */
public class StudentControllerInjector implements ControllerInjector {
    @Override
    public StudentController getController(Model model, View view) {
        return new StudentController(model, view);
    }
}
