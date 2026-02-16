public class Circle extends Shape {
    public int radius;
    public  Circle(String colour,boolean isFilled,int radius) {
        super(colour,isFilled);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI * radius;
    }
}
