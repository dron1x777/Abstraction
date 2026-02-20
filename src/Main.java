import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Direction.NORTH.getOpposite(Direction.NORTH));
        System.out.println(Direction.SOUTH.getOpposite(Direction.SOUTH));
        System.out.println(Direction.EAST.getOpposite(Direction.EAST));
        System.out.println(Direction.WEST.getOpposite(Direction.WEST));
    }
}