public class Doctor extends MedicalStaff {
    private String type;
    private int patients;

    public Doctor(String name, int age, int experience, double salary, String department, String type, int patients) {
        super(name, age, experience, salary, department);
        this.type = type;
        this.patients = patients;
    }

    public int getPatients() {
        return patients;
    }

    public void setPatients(int patients) {
        this.patients = patients;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor performs duties: check patients and working");
    }

    @Override
    public void getWorkSchedule() {
        System.out.println("Doctor work schedule: check patients (9:00-13:00) and working (13:00-16:00)");
    }

}
