public abstract class MedicalStaff {
    private String name;
    private int age;
    private int experience;
    private double salary;
    private String department;
    public MedicalStaff(String name, int age, int experience, double salary, String department) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void performDuties();
    public abstract void getWorkSchedule();
    String introduceYourself() {
        return "name: " + name + ", age: " + age + ", experience: " + experience + ", salary: " + salary + ", department: " + department;
    }
    String calculateBonus() {
        return "your bonus is: " + (experience * 1000 + 5000);
    }
}
