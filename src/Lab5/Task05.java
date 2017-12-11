package Lab5;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double km;
        km = s.nextDouble();
        double f;
        f = s.nextDouble();
        if (km<0) {
            System.out.println("Расстояние между деревнями должно быть неотрицательно");
            return;
        }
        if (f<0) {
            System.out.println("Длина кабеля должна быть неотрицательна");
            return;
        }
        if (km*1000<f*0.305) {
            System.out.println("Кабеля хватит. Расстояние меньше длины кабеля");

        }else {
            System.out.println("Кабеля не хватит. Длина кабеля меньше расстояния");
        }

    }
}
