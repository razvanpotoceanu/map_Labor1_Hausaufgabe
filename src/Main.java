import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] noten = {10, 20, 30, 40, 50, 70, 20};

        ArrayList<Integer> notenNichtAusreichend = NotenNichtAusreichender.findeNichtAusreichende(noten);

        System.out.println("Noten nicht Ausreichend: ");
        for (int n: notenNichtAusreichend) {
            System.out.print(n + " ");
        }

        System.out.printf("\nDurchschnittswert: %.2f\n ", NotenDurchschnitt.findeNotenDurchschnitt(noten));



    }
}