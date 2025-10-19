package aufgabe4;

public class TeuerstenGegenstand {
    public static int findeTeuerstenGegenstand(int[] tastaturen, int[] USB) {
        int max = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++) {
            if(tastaturen[i] > max) {
                max = tastaturen[i];
            }
        }
        for(int j = 1; j < USB.length; j++) {
            if(USB[j] > max) {
                max = USB[j];
            }
        }
        return max;
    }
}
