import java.util.ArrayList;

public class NotenNichtAusreichender {
    public static ArrayList<Integer> findeNichtAusreichende(int[] noten) {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 40) {
                liste.add(noten[i]);
            }
        }
        return liste;
    }
}
