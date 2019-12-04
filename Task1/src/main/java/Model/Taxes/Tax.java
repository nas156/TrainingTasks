package Model.Taxes;

public class Tax {
    private int mainIncomePerYear;
    private int numberOfChildren;
    protected double taxToPay=0;

    public Tax(int mainWorkIncome, int numberOfChildren) {
        this.mainIncomePerYear = mainWorkIncome;
        this.numberOfChildren = numberOfChildren;
    }

    protected double countGeneralTax() {
        return getMainIncomePerYear() * 0.2;
    }

    protected double countChildrenExemptionPercent() {
        return 1 - getNumberOfChildren() * 0.05;
    }

    public void countTaxToPay(){
        this.taxToPay = countGeneralTax() * countChildrenExemptionPercent();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Tax)) return false;
        Tax someTax = (Tax) o;
        return someTax.numberOfChildren == this.numberOfChildren &&
                someTax.mainIncomePerYear == this.mainIncomePerYear;

    }

    @Override
    public int hashCode() {
        int result;
        result = mainIncomePerYear * 31 + numberOfChildren;
        return result;
    }

    @Override
    public String toString(){
        return String.format("%,.2f", getTaxToPay()) + "\n";
    }

    public int getNumberOfChildren() {
        return this.numberOfChildren;
    }

    public int getMainIncomePerYear() {
        return this.mainIncomePerYear;
    }

    public double getTaxToPay(){
        if (taxToPay == 0){
            this.countTaxToPay();
        }
        return this.taxToPay;
    }
}
