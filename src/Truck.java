public class Truck extends Car {
    private boolean canCarry;

    public Truck(String model, String colour, int maxSpeed, boolean canCarry) {
        super(model, colour, maxSpeed);
        this.canCarry = canCarry;
    }
    void setCanCarry(boolean canCarry) {
        this.canCarry = canCarry;
    }
    Boolean getCanCarry() {
        return canCarry;
    }

    @Override
    public void gas() {
        System.out.println(getModel()+" is gassing");
    }

    @Override
    public void brake() {
        System.out.println(getModel()+" is braking");
    }
}
