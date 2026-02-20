import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Season[] season = {
                Season.AUTUMN,
                Season.WINTER,
                Season.SUMMER,
                Season.SPRING
        };
        for (Season s : season) {
            System.out.println(s.getNameRy());
        }
    }
}