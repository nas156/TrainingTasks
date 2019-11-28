package HW4;

import HW4.Controller.Controller;
import HW4.Model.UserAccount;

public class Main {
    public static void main(String[] args) {
        UserAccount model = new UserAccount();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processeUser();
    }
}
