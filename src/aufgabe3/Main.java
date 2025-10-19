package aufgabe3;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //subpunct1
        int[] array1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] array2 = {8, 2, 0, 0, 0, 0, 0, 0, 0};

        int[] summe = Summe.findeSumme(array1, array2);
        System.out.println("Summe: ");
        int start = (summe[0] == 0) ? 1 : 0;
        for (int i = start; i < summe.length; i++) {
            System.out.print(summe[i]);
        }
        System.out.println();

        //subpunct2

//        int[] array3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
//        int[] array4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        int[] array3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] array4 = {8, 2, 0, 0, 0, 0, 0, 0, 0};

        int[] differenz = Differenz.findeDifferenz(array3, array4);
        System.out.println("Differenz: ");
        start = (differenz[0] == 0) ? 1 : 0;
        for (int i = start; i < differenz.length; i++) {
            System.out.print(differenz[i]);
        }
        System.out.println();

        //subpunct 3

        int[] array5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int ziffer = 2;
        System.out.println("Multiplikation: ");
        int[] multiplikation = Multiplikation.multipliziereMitZiffer(array5, ziffer);
        start = (multiplikation[0] == 0) ? 1 : 0;
        for (int i = start; i < multiplikation.length; i++) {
            System.out.print(multiplikation[i]);
        }

        System.out.println();

        //subpunct 4
        int[] array6 = {1, 3, 6, 0, 0, 0, 0, 0, 0};
        int[] division = Division.divisionMitZiffer(array6, ziffer);
        System.out.println("Division: ");
        start = (division[0] == 0) ? 1 : 0;

        for (int i = start; i < division.length; i++) {
            System.out.print(division[i]);
        }
    }
}
