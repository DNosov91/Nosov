package Lab6;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int i, j=0;
        while(j<=9) {
            i=0;
            while(i<w) {
                System.out.print(j);
                i++;
            }
            j++;
            System.out.println();
        }
    }
}
