import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (Week week:Week.values()) {
            System.out.println(week.getDescription());
        }
    }
}