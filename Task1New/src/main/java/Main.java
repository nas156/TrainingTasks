import controller.Controller;
import model.PersonalTaxRecorder;
import model.entity.user.TaxPayer;
import model.entity.user.UserProperty;
import view.View;

public class Main {
    public static void main(String[] args) {
        TaxPayer user = new TaxPayer(80000,3,6000, UserProperty.values());
        PersonalTaxRecorder personalTaxRecorder = new PersonalTaxRecorder(user);
        View view = new View();
        Controller controller = new Controller(personalTaxRecorder, view);
        controller.processUser();
    }
}
