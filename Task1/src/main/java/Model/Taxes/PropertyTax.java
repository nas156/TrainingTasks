package Model.Taxes;

public class PropertyTax extends Tax {
    private int propertyCost;
    private String nameOfProperty;

    public PropertyTax(int mainIncomePerYear, int numberOfChildren, int propertyCost, String nameOfProperty) {
        super(mainIncomePerYear, numberOfChildren);
        this.propertyCost = propertyCost;
        this.nameOfProperty = nameOfProperty;
    }

    @Override
    protected double countGeneralTax() {
        return propertyCost * 0.17;
    }

    protected double countLowIncomeExemptionPercent() {
        int mainIncome = getMainIncomePerYear();
        if (mainIncome < 4700)
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
        return this.propertyCost == propertyTax.propertyCost && this.nameOfProperty.equals(propertyTax.nameOfProperty);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode() * 51 + this.getPropertyCost();
        return result;
    }

    @Override
    public String toString() {
        return "PropertyTax for " + nameOfProperty + ": "+ super.toString();
    }

    public int getPropertyCost() {
        return propertyCost;
    }
}
