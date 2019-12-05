package Model.User;


public enum UserProperty {
    CAR(80000), HOUSE(900000), COUNTRYSIDE_HOUSE(700000), COW(5000);

    private int cost;

    UserProperty(int cost){
        this.cost = cost;
    }

    public int getCost(){
        return this.cost;
    }

    @Override
    public String toString(){
        return name().toLowerCase();
    }

}
