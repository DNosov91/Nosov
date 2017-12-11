package Lab5;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int P;
        P = s.nextInt();
        int Q;
        Q = s.nextInt();
        if (P>Q) {
            System.out.println("Максимальное " + P + " Минимальное " + Q);
        }else {
            System.out.println("Максимальное " + Q + " Минимальное " + P);

        }
    }
}
