package Model.Taxes;

import Model.User.Property;

public class PropertyTax extends Tax {
    private Property property;

    public PropertyTax(int mainIncomePerYear, int numberOfChildren, Property property) {
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
        int result = super.hashCode() * 51 + this.getPropertyCost();
        return result;
    }

    @Override
    public String toString() {
        return "PropertyTax for " + property + ": "+ super.toString();
    }

    public int getPropertyCost(){
        return property.getCost();
    }

}
