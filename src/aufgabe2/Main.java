package aufgabe2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,8,3,10,17};

        //subpunct1
        int max = MaximaleZahl.findeMaximaleZahl(array);
        System.out.println("Maximale Zahl: " + max);

        //subpunct2
        int min = MinimaleZahl.findeMinimaleZahl(array);
        System.out.println("Minimale Zahl: " + min);

        //subpunct3
        System.out.println("Maximale Summe von n-1 Zahlen: " + MaximaleSummeMin1.findeMaximaleSummeMin1(array, min));

        //subpunct4
        System.out.println("Maximale Summe von n-1 Zahlen: " + MinimaleSummeMin1.findeMinimaleSummeMin1(array, max));

    }
}
