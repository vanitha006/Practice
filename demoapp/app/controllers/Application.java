package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    public static void sayHello() {
        render(myName);
    }
}