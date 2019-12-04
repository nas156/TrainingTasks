package Model.Taxes;

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
        int result = super.hashCode() * 31 + this.extraIncomePerYear;
        return result;
    }

    @Override
    public String toString() {
        return "Income Tax: " + super.toString();
    }

    public int getExtraIncomePerYear() {
        return this.extraIncomePerYear;
    }
}
