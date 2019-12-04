package Model.User;

public enum Property {
    CAR(80000), HOUSE(900000), COUNTRYSIDE_HOUSE(700000), COW(5000);

    private int cost;

    Property(int cost){
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
