public class Motorcycle extends Car {
    private float kubatura;
    public Motorcycle(String model, String colour, int maxSpeed,float kubatura) {
        super(model, colour, maxSpeed);
        this.kubatura = kubatura;
    }

    public float getKubatura() {
        return kubatura;
    }

    public void setKubatura(float kubatura) {
        this.kubatura = kubatura;
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
