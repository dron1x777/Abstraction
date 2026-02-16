public class Main {
    public static void main(String[] args) {
        MedicalStaff[] medicalStaff = {
                new Doctor("doctor", 34, 3, 35000, "jtnbifoi", "itvio", 23),
                new Doctor("doctor2", 54, 13, 50000, "rgv3w", "t4vgb", 43),
                new Nurse("nurse", 24, 4, 25000, "nvrvn", "night", "babyhouse"),
                new Nurse("nurse2", 34, 6, 34000, "rg f  h", "night", "babyhouse"),
                new Surgeon("surgeon", 35, 13, 234554, "ckjbcnvt", 35, "efvnov"),
                new Surgeon("surgeon2", 23, 4, 34453, "vrvtvt", 4, "tv4tvt4"),
        };
        medicalStaff[1].calculateBonus();
        medicalStaff[3].calculateBonus();
        medicalStaff[5].calculateBonus();
        medicalStaff[4].getWorkSchedule();
        medicalStaff[2].calculateBonus();
        medicalStaff[0].performDuties();
    }
}