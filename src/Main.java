import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("work days: ");
        for (Week week: Week.values()) {
            if(!week.isWeekend()){
                System.out.println(week);
                System.out.println("-----------------------------------");
            }
        }
        System.out.println("rest days: ");
        for(Week week: Week.values()){
            if(week.isWeekend()){
                System.out.println(week);
                System.out.println("--------------------------------");
            }
        }
    }
}