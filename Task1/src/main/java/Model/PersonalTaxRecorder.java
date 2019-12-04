package Model;

import Model.Taxes.IncomeTax;
import Model.Taxes.PropertyTax;
import Model.Taxes.Tax;
import Model.User.Property;
import Model.User.User;

public class PersonalTaxRecorder {
    private Tax[] taxes;
    private User user;
    private int counter = 0;
    private double fullTaxToPay = 0;

    public PersonalTaxRecorder(User user){
        this.user = user;
        taxes = new Tax[1+user.getNumberOfProperties()];
    }

    private void addIncomeTax(){
        taxes[counter++] = new IncomeTax(user.getMainIncomePerYear(), user.getNumberOfChildren(),  user.getExtraIncome());
    }

    private void addPropertyTax(){
        if(user.getNumberOfProperties()!=0){
            for (Property property:user.getProperties()) {
                taxes[counter++] = new PropertyTax(user.getMainIncomePerYear(), user.getNumberOfChildren(), property);
            }
        }
    }

    private void countFullTax(){
        addPropertyTax();
        addIncomeTax();
        for (Tax tax: taxes) {
            fullTaxToPay += tax.getTaxToPay();
        }
    }

    public double getFullTaxToPay(){
        if (this.fullTaxToPay == 0) countFullTax();
        return this.fullTaxToPay;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder("Full tax to pay: " + String.format("%,.2f", this.getFullTaxToPay()) + "\n");
        for (Tax tax: taxes) {
            res.append(tax);
        }
        return res.toString();
    }

}