import com.sun.net.httpserver.HttpServer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HttpStatus.getInfo(HttpStatus.BAD_REQUEST);
        System.out.println(HttpStatus.NOT_FOUND.getNameRy());
        System.out.println(HttpStatus.fromCode(200));
    }
}