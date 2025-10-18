package aufgabe3;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //subpunct1
        int[] array1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] array2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] summe = Summe.findeSumme(array1, array2);
        System.out.println("Summe: ");
        for (int n : summe) {
            System.out.print(n);
        }
        System.out.println();

        //subpunct2

        int[] array3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] array4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        int[] differenz = Differenz.findeDifferenz(array3, array4);
        System.out.println("Differenz: ");

        for (int d : differenz) {
            System.out.print(d);
        }
    }
}
