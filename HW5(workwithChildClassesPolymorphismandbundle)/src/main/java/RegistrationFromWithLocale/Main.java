package RegistrationFromWithLocale;

import RegistrationFromWithLocale.Controller.Controller;
import RegistrationFromWithLocale.Model.UserAccount;
import RegistrationFromWithLocale.View.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new UserAccount(), new View());
        controller.processeUser();
    }
}
