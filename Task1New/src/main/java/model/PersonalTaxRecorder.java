package model;

import lombok.Getter;
import model.entity.tax.IncomeTax;
import model.entity.tax.PropertyTax;
import model.entity.tax.Tax;
import model.entity.user.TaxPayer;
import model.entity.user.UserProperty;

import java.util.Arrays;
import java.util.Comparator;

@Getter
public class PersonalTaxRecorder {
    private Tax[] taxes;
    private TaxPayer user;
    private int counter;
    private double fullTaxToPay;

    public PersonalTaxRecorder(TaxPayer user) {
        this.user = user;
        taxes = new Tax[1 + user.getNumberOfProperties()];
    }

    private void addIncomeTax() {
        taxes[counter++] = new IncomeTax(user.getMainIncomePerYear(), user.getNumberOfChildren(), user.getExtraIncome());
    }

    private void addPropertyTax() {
        if (user.getNumberOfProperties() != 0) {
            for (UserProperty property : user.getProperties()) {
                taxes[counter++] = new PropertyTax(user.getMainIncomePerYear(), user.getNumberOfChildren(), property);
            }
        }
    }

    private void countFullTax() {
        addPropertyTax();
        addIncomeTax();
        for (Tax tax : taxes) {
            fullTaxToPay += tax.countTaxToPay();
        }
    }

    public double getFullTaxToPay() {
        if (this.fullTaxToPay == 0) countFullTax();
        return this.fullTaxToPay;
    }

    public void sortTaxesByValue() {
        Arrays.sort(taxes, Comparator.comparing(Tax::countTaxToPay));
    }
}
