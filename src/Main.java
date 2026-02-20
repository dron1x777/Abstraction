import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    enter region 1-7: 
                    1 - Osh
                    2 - Batken
                    3 - Chyi
                    4 - Issyk-Kol
                    5 - Jalal-Abad
                    6 - Naryn
                    7 - Talas
                    : """);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(Region.OSH.getNameRy());
                    System.out.println("----------------------------------------------");
                    System.out.println("""
                            Древний город Ош
                           
                            Гора Сулайман-Тоо
                            
                            Часть Ферганской долины
                            
                            Развитое сельское хозяйство""");
                    System.out.println("----------------------------------------------");
                    break;
                case 2:
                    System.out.println(Region.BATKEN.getNameRy());
                    System.out.println("----------------------------------------------");
                    System.out.println("""
                            Самая южная область
                            
                            Граничит с Таджикистаном и Узбекистаном
                            
                            Сложная приграничная ситуация""");
                    System.out.println("----------------------------------------------");
                    break;
                case 3:
                    System.out.println(Region.CHYI.getNameRy());
                    System.out.println("----------------------------------------------");
                    System.out.println("""
                            Здесь находится столица — Бишкек
                            
                            Самая развитая промышленность
                            
                            Плодородная Чуйская долина
                            
                            Много заводов и университетов""");
                    System.out.println("----------------------------------------------");
                    break;
                case 4:
                    System.out.println(Region.ISSYKKOL.getNameRy());
                    System.out.println("----------------------------------------------");
                    System.out.println("""
                            Озеро Иссык-Куль — одно из крупнейших в мире
                            
                            Главный туристический регион
                         
                            Курорты и санатории""");
                    System.out.println("---------------------------------------------");
                    break;
                case 5:
                    System.out.println(Region.JALALABAD.getNameRy());
                    System.out.println("---------------------------------------------");
                    System.out.println("""
                            Ореховые леса Арсланбоб
                            
                            Озеро Сары-Челек
                            
                            Токтогульская ГЭС""");
                    System.out.println("--------------------------------------------");
                    break;
                case 6:
                    System.out.println(Region.NARYN.getNameRy());
                    System.out.println("--------------------------------------------");
                    System.out.println("""
                            Самая высокогорная область
                            
                            Озеро Сон-Куль
                            
                            Развито скотоводство""");
                    System.out.println("---------------------------------------------");
                    break;
                case 7:
                    System.out.println(Region.TALAS.getNameRy());
                    System.out.println("-------------------------------------------");
                    System.out.println("""
                            Родина эпоса Манас
                            
                            Меньше население
                            
                            Сельское хозяйство""");
                    System.out.println("---------------------------------------------");
                    break;
            }
        }
    }
}