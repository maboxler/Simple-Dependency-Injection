package MVC.Controller;


import MVC.Controller.impl.TeacherController;
import MVC.Model.Model;
import MVC.View.View;

/**
 * Created by mbo on 12.09.2017.
 */
public interface ControllerInjector {
     Controller getController(Model model, View view);
}
