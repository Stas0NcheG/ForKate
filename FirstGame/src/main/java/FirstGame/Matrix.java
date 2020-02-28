package FirstGame;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Random ran = new Random();
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int w = in.nextInt();
//        int q = in.nextInt();
        int q = (int) (1 + (Math.random() * (10)));
        int w = (int) (1 + (Math.random() * (q)));
        System.out.println(w);
        System.out.println(q);
        int[][] a = new int[w][q];


        for (int i = 0; i < w; i++) {
            for (int j = 0; j < q; j++) {
                a[i][j] = ran.nextInt(9);
//                System.out.print(a[i][j]);
//                System.out.println(" ");
            }
        }
        int s = 0;
        int b = 0;
        int c = 0;
        int n = a.length;
        for (int f = 0; f < n; ++f) {
            b += a[f][f];
            s += a[f][n - 1 - f];
        }
            c = b + s;
            System.out.println(b);
            System.out.println(s);
            System.out.println(c);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
    }
}