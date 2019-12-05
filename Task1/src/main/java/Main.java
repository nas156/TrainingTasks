import Model.PersonalTaxRecorder;
import Model.User.UserProperty;
import Model.User.User;
import View.View;

public class Main {
    public static void main(String[] args) {
        User user = new User(80000,3,6000, UserProperty.values());
        PersonalTaxRecorder personalTaxRecorder = new PersonalTaxRecorder(user);
        View view = new View();
        Controller controller = new Controller(personalTaxRecorder, view);
        controller.processUser();
    }

}
