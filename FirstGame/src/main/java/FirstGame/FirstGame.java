package FirstGame;

import java.util.Random;
import java.util.Scanner;
public class FirstGame {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Димон, где число???");
        int number = sc.nextInt();
        while ((number != num) && i <= 4) {
            if (number < num)
                System.out.println("твое число меньше, вводи еще");
            if (number > num)
                System.out.println("Твое число больше, вводи еще");
            number = sc.nextInt();
            i++;
        }
        if (i == 5 && number != num) {
            System.out.println("Лошара, не угадал");
        } else {
            System.out.println("Ты чертов гений");
        }
    }
}
