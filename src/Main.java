import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();

        for (Operation operation:Operation.values()) {
            System.out.println(operation.apply(a, b));
        }
    }
}