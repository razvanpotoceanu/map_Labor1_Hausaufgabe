

public class Main {
    public static void main(String[] args) {
//pb1
        int[] noten = {10, 20, 30, 40, 50, 70, 20, 23, 24, 22, 38, 42, 78, 80};

        int[] notenNichtAusreichend = NotenNichtAusreichender.findeNichtAusreichende(noten);
//test subpunct1
        System.out.println("Noten nicht Ausreichend: ");
        for (int n: notenNichtAusreichend) {
            System.out.print(n + " ");
        }
//test subpunct2
        System.out.printf("\nDurchschnittswert: %.2f ", NotenDurchschnitt.findeNotenDurchschnitt(noten));


        //test subpunct 3
        int[] abgerundet = NotenAbgerundete.notenAbgerundete(noten);
        System.out.println("\nAbgerundeten Noten: ");
        for (int n: abgerundet) {
            System.out.print(n + " ");
        }

        //test subpunct 4
        System.out.println("\nMaximale abgerundete Note: " + MaximaleAbgerundeteNote.findeMaximaleAbgerundeteNote(abgerundet));
    }
}