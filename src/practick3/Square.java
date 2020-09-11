package practick3;

public class Square extends Rectangle{
    private double side = 0.0;

    public Square() {
        this.filled = false;
        this.color = "Red";
        this.width = 1.0;
        this.length = 1.0;
        side = 1.0;
    }

    public Square(double side) {
        this.filled = false;
        this.color = "Red";
        this.width = 1.0;
        this.length = 1.0;
        this.side = side;
    }

    public Square(double width, double length, String color, boolean filled, double side) {
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Shape: Square{Side = " + this.side + '}';
    }

}
