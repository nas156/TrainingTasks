package Model.User;

public class User {
    private int mainIncomePerYear;
    private int numberOfChildren;
    private int extraIncome;
    private Property[] properties;

    public User(int mainIncomePerYear, int numberOfChildren, int extraIncome, Property... properties) {
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

    public Property[] getProperties() {
        return properties;
    }

    public int getNumberOfProperties() {
        return properties.length;
    }

    public int getExtraIncome(){
        return this.extraIncome;
    }
}
