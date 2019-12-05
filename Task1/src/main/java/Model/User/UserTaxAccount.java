package Model.User;

/**
 * Represents a personal information for calculating taxes
 * @author nas156
 */
public class UserTaxAccount {
    private int mainIncomePerYear;
    private int numberOfChildren;
    private int extraIncome;
    private UserProperty[] properties;

    public UserTaxAccount(int mainIncomePerYear, int numberOfChildren, int extraIncome, UserProperty... properties) {
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
