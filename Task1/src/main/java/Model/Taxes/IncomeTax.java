package Model.Taxes;
import View.*;
import java.util.ResourceBundle;

/**
 * Work with a tax for person`s income: main and extra
 * @author nas156
 */

public class IncomeTax extends Tax {
    private int extraIncomePerYear;

    public IncomeTax(int mainIncomePerYear, int numberOfChildren, int extraIncomePerYear) {
        super(mainIncomePerYear, numberOfChildren);
        this.extraIncomePerYear = extraIncomePerYear;
    }

    @Override
    protected double countGeneralTax() {
        return super.countGeneralTax() + (getExtraIncomePerYear() * 0.08);
    }

    @Override
    public void countTaxToPay() {
        this.taxToPay = this.countGeneralTax() * super.countChildrenExemptionPercent();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(super.equals(o))) return false;
        IncomeTax incTax = (IncomeTax) o;
        return this.extraIncomePerYear == incTax.extraIncomePerYear;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 31 + this.extraIncomePerYear;
    }

    @Override
    public String toString() {
        return "Income Tax: " + super.toString();
    }

    public String toLocaledString(ResourceBundle bundle){
        return bundle.getString(TextConstants.MESSAGE_ABOUT_INCOME_TAX) + super.toLocaledString(bundle);
    }

    public int getExtraIncomePerYear() {
        return this.extraIncomePerYear;
    }
}
