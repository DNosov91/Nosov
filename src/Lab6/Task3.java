package Lab6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        a = s.nextInt();
        b = s.nextInt();
        if (a>b) {
            System.out.println("Значение A должно быть не больше значения B");
            return;
        }
        while (a<=b) {
            System.out.println(a);
            a++;
        }



    }
}
