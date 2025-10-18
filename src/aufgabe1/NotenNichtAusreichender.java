package aufgabe1;

public class NotenNichtAusreichender {
    public static int[] findeNichtAusreichende(int[] noten) {
        int count = 0;
        for (int i = 0; i < noten.length; i++)
        {
            if (noten[i] < 40) count++;
        }
        int[] ausreichend = new int[count];
        count = 0;
        for (int i = 0; i < noten.length; i++)
        {
            if (noten[i] < 40) ausreichend[count++] = noten[i];
        }
        return ausreichend;
    }
}
