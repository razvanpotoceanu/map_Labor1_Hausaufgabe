

public class NotenAbgerundete {
    public static int[] notenAbgerundete(int[] noten) {
        int[] gerundeteNoten = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 38) {
                gerundeteNoten[i] = noten[i];
            } else {
                int nextMultipleOf5 = (noten[i] / 5 + 1) * 5;
                if (nextMultipleOf5 - noten[i] < 3) {
                    gerundeteNoten[i] = nextMultipleOf5;
                } else {
                    gerundeteNoten[i] = noten[i];
                }
            }
        }
        return gerundeteNoten;
    }
}

