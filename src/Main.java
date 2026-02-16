public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Motorcycle("motorcycle2", "white", 260, 346.4f),
                new Motorcycle("motorcycle1", "red", 454, 253),
                new Truck("truck1", "black", 130, true),
                new  Truck("truck2", "red", 90, true),
                new Bus("bus1", " purple", 160, 25),
                new Bus("bus2", " yellow", 140, 35),
        };
        cars[2].gas();
        cars[3].brake();
        cars[4].gas();
        cars[2].brake();
        cars[1].gas();
    }
}