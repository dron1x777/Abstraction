public class Bus extends Car{
    private int seats;
    public Bus(String model, String colour, int maxSpeed, int seats) {
        super(model, colour, maxSpeed);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
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
