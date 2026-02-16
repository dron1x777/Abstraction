public abstract class Shape {
    private String colour;
    private boolean isFilled;

    public  Shape(String colour,boolean isFilled) {
        this.colour = colour;
        this.isFilled = isFilled;
    }

    protected Shape() {
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    abstract public double calculateArea();
    abstract public double calculatePerimeter();
    String getInfo() {
        return "colour is: " + colour + ", is filled: " + isFilled;
    }


}
