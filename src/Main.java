import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (Season season : Season.values()) {
            System.out.println(season.getNameRy());
        }
    }
}