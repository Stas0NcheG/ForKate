package FirstGame;

public class Matrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 1},
                    {4, 5, 6, 1, 7},
                    {7, 8, 1, 12, 9},
                    {5, 100, 10, 20, 10},
                    {1, 7, 10, 20, 10}};
        int s = 0;
        int b = 0;
        int c = 0;
        int n = a.length;
        for (int i = 0; i < n; ++i) {
                b += a[i][i];
                s += a[i] [n-1-i];
            }
            c = b + s;
            System.out.println(s);
                System.out.println(b);
                    System.out.println(c);
        }
    }
