package CreateChildClass;

public class TestChildClass {
    public static void main(String[] args) {
        Point point = new Point(3,5);
        Circle circle = new Circle(3,5,19);
        Point point1 = new Circle(4,5,1);
        System.out.println(point.getCoordX());
        System.out.println(circle.getCoordY());
        System.out.println(circle.getRadius());
        System.out.println(point1.getCoordX());
        System.out.println(point);
        System.out.println(circle);
        System.out.println(point1);
    }
}
