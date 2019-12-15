package model.entity.tax;


import lombok.Getter;


@Getter
public class IncomeTax implements Tax {
    private int mainIncomePerYear;
    private int numberOfChildren;
    private double taxToPay;
    private int extraIncome;
    private final double MAIN_INCOME_TAX_COEF = 0.2;
    private final double EXTRA_INCOME_TAX_COEF = 0.08;

    public IncomeTax(int mainIncomePerYear, int numberOfChildren, int extraIncome){
        this.mainIncomePerYear = mainIncomePerYear;
        this.numberOfChildren = numberOfChildren;
        this.extraIncome = extraIncome;
    }

    public int countGeneralTax() {
        return (int) (this.mainIncomePerYear * MAIN_INCOME_TAX_COEF + this.extraIncome * EXTRA_INCOME_TAX_COEF);
    }

    @Override
    public double countChildrenExemption() {
        if (numberOfChildren >= MAX_NUMBER_OF_CHILDREN_TO_COUNT_EXEMPTION) return MAX_EXEMPTION_FOR_CHILDREN;
        return 1 - getNumberOfChildren() * 0.05;
    }

    @Override
    public double countTaxToPay() {
        return (this.countGeneralTax()*this.countChildrenExemption());
    }

    public double getTaxToPay(){
        if (this.taxToPay == 0)
            this.taxToPay = countTaxToPay();
        return this.taxToPay;
    }
}
