import Model.PersonalTaxRecorder;
import View.View;
import View.TextConstants;

public class Controller {
    private PersonalTaxRecorder personalTaxRecorder;
    private View view;

    Controller(PersonalTaxRecorder personalTaxRecorder, View view){
        this.personalTaxRecorder = personalTaxRecorder;
        this.view = view;
    }

    public void processUser(){
        view.printMessage(view.getLocaledMessage(view.concatenateString(TextConstants.MESSAGE_ABOUT_FULL_TAX))+
                                                    view.getLocaledMessage(TextConstants.MESSAGE_ABOUT_CURRENCY) +
                                                        personalTaxRecorder.getFullTaxToPay()+TextConstants.NEW_LINE_CHAR);

        view.printMessage(view.concatenateString(TextConstants.SEPARATOR,
                                                view.getLocaledMessage(TextConstants.MESSAGE_ABOUT_ALL_TAXES),
                                                                                    TextConstants.NEW_LINE_CHAR));

        view.printMessage(this.personalTaxRecorder.toLocaledString(View.bundle));
        view.printMessage(TextConstants.SEPARATOR);
        view.printMessage(view.getLocaledMessage(TextConstants.MESSAGE_ABOUT_SORTED_TAXES) + TextConstants.NEW_LINE_CHAR);
        personalTaxRecorder.sortTaxesByValue();
        view.printMessage(this.personalTaxRecorder.toLocaledString(View.bundle));
    }

}
