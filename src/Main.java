import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String beatyCenter;
        final int NUM = 2016;
        String word = "customer";
        String beatycenter = NUM + word;
        System.out.println(beatycenter + " " + word + NUM );
        if (NUM<0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM>0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = sc.next();
        System.out.println("Ассаламу Алейкум ва рахматуллахи ва баракутуху, "+name+ "!");
    }
}
