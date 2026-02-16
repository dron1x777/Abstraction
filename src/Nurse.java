public class Nurse extends MedicalStaff {
    private String nightOrDay;
    private String typeOfWorking;

    public Nurse(String name, int age, int experience, double salary, String department, String nightOrDay, String typeOfWorking) {
        super(name, age, experience, salary, department);
        this.nightOrDay = nightOrDay;
        this.typeOfWorking = typeOfWorking;
    }

    public String getNightOrDay() {
        return nightOrDay;
    }

    public void setNightOrDay(String nightOrDay) {
        this.nightOrDay = nightOrDay;
    }

    public String getTypeOfWorking() {
        return typeOfWorking;
    }

    public void setTypeOfWorking(String typeOfWorking) {
        this.typeOfWorking = typeOfWorking;
    }

    @Override
    public void performDuties() {
        System.out.println("Nurse perform duties: I DON'T KNOW");
    }

    @Override
    public void getWorkSchedule() {
        System.out.println("Nurse work schedule: I DON'T KNOW");
    }
}
