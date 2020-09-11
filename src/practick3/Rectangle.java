package practick3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.filled = false;
        this.color = "Yellow";
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.filled = false;
        this.color = "Yellow";
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * (length + width));
    }

    @Override
    public String toString() {
        return "Shape: Rectangle{" + "Length = " + this.length +", Width = " + this.width +'}';
    }

}
