public class Surgeon extends MedicalStaff {
    private int countOfOperations;
    private String type;

    public Surgeon(String name, int age, int experience, double salary, String department,int countOfOperations,  String type) {
        super(name, age, experience, salary, department);
        this.countOfOperations = countOfOperations;
        this.type = type;
    }

    public int getCountOfOperations() {
        return countOfOperations;
    }

    public void setCountOfOperations(int countOfOperations) {
        this.countOfOperations = countOfOperations;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void performDuties() {
        System.out.println("Surgeon is performing Duties: do operation");
    }

    @Override
    public void getWorkSchedule() {
        System.out.println("Nurse work schedule: operation (13:00-2:00)");
    }
}
