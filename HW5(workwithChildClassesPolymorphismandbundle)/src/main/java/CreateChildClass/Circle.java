package CreateChildClass;

public class Circle extends Point{
    private double radius;
    public Circle(int x, int y, double radius){
        super(x, y);
        checkRadius(radius);
    }

    public final void checkRadius(double radius) throws IllegalArgumentException {
        if( radius <= 0 ){
            throw new IllegalArgumentException("radius must be greater then 0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                super.toString()+
                "radius= " + radius;
    }

}
