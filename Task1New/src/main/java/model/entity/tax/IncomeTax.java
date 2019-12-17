package model.entity.tax;

import lombok.Getter;

@Getter
public class IncomeTax extends SimpleTax {
    private int extraIncome;
    private final double MAIN_INCOME_TAX_COEF = 0.2;
    private final double EXTRA_INCOME_TAX_COEF = 0.08;

    public IncomeTax(int mainIncomePerYear, int numberOfChildren, int extraIncome){
        super(mainIncomePerYear, numberOfChildren);
        this.extraIncome = extraIncome;
    }

    public double countGeneralTax() {
        return getMainIncomePerYear() * MAIN_INCOME_TAX_COEF + this.extraIncome * EXTRA_INCOME_TAX_COEF;
    }

    @Override
    public double countChildrenExemption() {
        if (getNumberOfChildren() >= MAX_NUMBER_OF_CHILDREN_TO_COUNT_EXEMPTION) return MAX_EXEMPTION_FOR_CHILDREN;
        return 1 - getNumberOfChildren() * 0.05;
    }

    @Override
    public double countTaxToPay() {
        return (this.countGeneralTax()*this.countChildrenExemption());
    }

    public double getTaxToPay(){
        if (super.getTaxToPay() == 0)
            setTaxToPay(countTaxToPay());
        return super.getTaxToPay();
    }
}
