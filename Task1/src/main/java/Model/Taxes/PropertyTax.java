package Model.Taxes;

import Model.User.UserProperty;
import View.TextConstants;

import java.util.ResourceBundle;

/**
 * Work with a tax for some person`s property
 * @author nas156
 */
public class PropertyTax extends Tax {
    private UserProperty property;

    public PropertyTax(int mainIncomePerYear, int numberOfChildren, UserProperty property) {
        super(mainIncomePerYear, numberOfChildren);
        this.property = property;
    }

    @Override
    protected double countGeneralTax() {
        return property.getCost() * 0.017;
    }

    protected double countLowIncomeExemptionPercent() {
        if (getMainIncomePerYear() < 30000)
            return 0.9;
        else
            return 1;
    }

    private double countFullExemptionPercent() {
        return countLowIncomeExemptionPercent() * countChildrenExemptionPercent();
    }

    @Override
    public void countTaxToPay() {
         this.taxToPay = countGeneralTax() * countFullExemptionPercent();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(super.equals(o))) return false;
        PropertyTax propertyTax = (PropertyTax) o;
        return this.property.equals(propertyTax.property);
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 51 + this.getPropertyCost();
    }

    @Override
    public String toString() {
        return "Property tax for " + property + ": "+ super.toString();
    }

    public String toLocaledString(ResourceBundle bundle){
        return bundle.getString(TextConstants.MESSAGE_ABOUT_PROPERTY_TAX) + bundle.getString(property.name()) + super.toLocaledString(bundle);
    }


    public int getPropertyCost(){
        return property.getCost();
    }

}
