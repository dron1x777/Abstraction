public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color,boolean filled) {
        super(color,filled);
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return (length + width) * 2;
    }
}
