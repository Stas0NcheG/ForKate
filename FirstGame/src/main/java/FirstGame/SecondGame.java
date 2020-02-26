package FirstGame;
import java.util.Scanner;
public class SecondGame {
    public static void main(String[] args) {
        int a = 0;
        int b = 1001;
        int c = (b-a)/2;
        int i = 1;
        System.out.println(c);
        System.out.println("Я угадал число?");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        while (!response.equals("y") && i <= 10) {
            if (response.equals("m")) {
                b = c;
                c = (b + a) / 2;
                System.out.println(c);
            }
             else if (response.equals("b")) {
                a = c;
                c = (b + a) / 2;
                System.out.println(c);
            }
            response = sc.nextLine();
            i++;
        }
        if  (i == 11 && !response.equals("y")) {
            System.out.println("дурить меня удумал, сын собаки?");
        } else {
            System.out.println("ты кожаный мешок дерьма, а я победил");
        }
    }
}

