public class Triangle extends Shape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(String colour,boolean isFilled,double firstSide,double secondSide,double thirdSide) {
        super(colour, isFilled);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double calculateArea() {
        double p = (firstSide + secondSide + thirdSide) / 2; // полупериметр
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
