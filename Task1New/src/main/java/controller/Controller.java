package controller;

import model.PersonalTaxRecorder;
import model.entity.tax.IncomeTax;
import model.entity.tax.PropertyTax;
import model.entity.tax.Tax;
import view.TextConstants;
import view.View;


import static view.View.bundle;

public class Controller {
    private PersonalTaxRecorder personalTaxRecorder;
    private View view;

    public Controller(PersonalTaxRecorder personalTaxRecorder, View view){
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

        printTaxes();

        personalTaxRecorder.sortTaxesByValue();
        view.printMessage(view.concatenateString(TextConstants.SEPARATOR,
                view.getLocaledMessage(TextConstants.MESSAGE_ABOUT_SORTED_TAXES),
                TextConstants.NEW_LINE_CHAR));

        printTaxes();
    }

    private String getLocaledTax(Tax tax){
        if (tax.getClass() == IncomeTax.class)
            return bundle.getString(TextConstants.MESSAGE_ABOUT_INCOME_TAX) +
                            bundle.getString(TextConstants.MESSAGE_ABOUT_CURRENCY) +
                                String.format("%,.2f", tax.countTaxToPay()) + "\n";
        else{
            return bundle.getString(TextConstants.MESSAGE_ABOUT_PROPERTY_TAX) +
                            bundle.getString(((PropertyTax) tax).getPropertyName()) +
                                bundle.getString(TextConstants.MESSAGE_ABOUT_CURRENCY) +
                                    String.format("%,.2f", tax.countTaxToPay()) + "\n";
        }

    }

    private void printTaxes(){
        for (Tax tax: personalTaxRecorder.getTaxes()) {
            view.printMessage(getLocaledTax(tax));
        }
    }
}