package Lab5;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k;
        k = s.nextInt();
        double r;
        if (k > 0) {
            r = Math.sqrt(k);
        } else {
            r = k * k;

        }
        System.out.println(r);
    }
}
