package Practice;

import java.util.Scanner;

public class TrianglePattern {


    public static void main(String[] args) {
        int n = 3;
        int c = n - 1;
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= c; i++)
                System.out.print(" ");
            c--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        c = 1;
        for (int k = 1; k <= n - 1; k++) {
            for (int i = 1; i <= c; i++)
                System.out.print(" ");
            c++;
            for (int i = 1; i <= 2 * (n - k) - 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }


}
