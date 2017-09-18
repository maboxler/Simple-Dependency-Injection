package MVC.Controller.impl;

import MVC.Controller.ControllerInjector;
import MVC.Model.Model;
import MVC.View.View;

/**
 * Created by mbo on 12.09.2017.
 */
public class TeacherControllerInjector implements ControllerInjector {
    @Override
    public TeacherController getController(Model model, View view) {
        return new TeacherController(model, view);
    }
}
