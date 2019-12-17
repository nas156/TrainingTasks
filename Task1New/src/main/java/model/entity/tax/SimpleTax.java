package model.entity.tax;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SimpleTax implements Tax {
    private int mainIncomePerYear;
    private int numberOfChildren;
    private double taxToPay;

    public SimpleTax(int mainIncomePerYear, int numberOfChildren){
        this.mainIncomePerYear = mainIncomePerYear;
        this.numberOfChildren = numberOfChildren;
    }

    @Override
    public abstract double countTaxToPay();

    @Override
    public abstract double countChildrenExemption();
}
