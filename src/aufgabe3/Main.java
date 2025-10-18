package aufgabe3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    //subpunct1
    int[] array1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
    int[] array2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

    int[] summe = Summe.findeSumme(array1, array2);
        for (int n : summe) {
            System.out.print(n );
        }
        System.out.println();
    }
}
