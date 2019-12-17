package model.entity.tax;



import lombok.Getter;
import model.entity.user.UserProperty;


@Getter
public class PropertyTax extends SimpleTax {
    private UserProperty property;
    private final int INCOME_TO_GIVE_EXEMPTION = 30000;
    private final double TAX_FOR_PROPERTY_COEF = 0.017;

    public PropertyTax(int mainIncomePerYear, int numberOfChildren, UserProperty property) {
        super(mainIncomePerYear, numberOfChildren);
        this.property = property;
    }


    public double countGeneralTax() {
        return property.getCost() * TAX_FOR_PROPERTY_COEF;
    }

    private double countLowIncomeExemptionPercent() {
        if (getMainIncomePerYear() < INCOME_TO_GIVE_EXEMPTION)
            return 0.9;
        else
            return 1;
    }

    @Override
    public double countChildrenExemption() {
        if (getNumberOfChildren() >= MAX_NUMBER_OF_CHILDREN_TO_COUNT_EXEMPTION) {
            return MAX_EXEMPTION_FOR_CHILDREN;
        }
        return 1 - getNumberOfChildren() * 0.05;
    }


    private double countFullExemption() {
        return countLowIncomeExemptionPercent() * countChildrenExemption();
    }

    @Override
    public double countTaxToPay() {
        return  countGeneralTax() * countFullExemption();
    }

    public double getTaxToPay(){
        if (super.getTaxToPay() == 0)
            setTaxToPay(countTaxToPay());
        return super.getTaxToPay();
    }

    public String getPropertyName(){
        return this.property.name();
    }
}
