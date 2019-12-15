package model.entity.user;

public class TaxPayer {
    private int mainIncomePerYear;
    private int numberOfChildren;
    private int extraIncome;
    private UserProperty[] properties;

    public TaxPayer(int mainIncomePerYear, int numberOfChildren, int extraIncome, UserProperty... properties) {
        this.mainIncomePerYear = mainIncomePerYear;
        this.numberOfChildren = numberOfChildren;
        this.extraIncome = extraIncome;
        this.properties = properties;
    }

    public int getMainIncomePerYear() {
        return mainIncomePerYear;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public UserProperty[] getProperties() {
        return properties;
    }

    public int getNumberOfProperties() {
        return properties.length;
    }

    public int getExtraIncome(){
        return this.extraIncome;
    }
}
