package CreateChildClass;

public class Point {
    private int coordX;
    private int coordY;

    public Point(int x, int y){
        this.coordX = x;
        this.coordY = y;
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString(){
        return "Point: Coord x: " + this.coordX +
                " Coord y: " + this.coordY;
    }

}
