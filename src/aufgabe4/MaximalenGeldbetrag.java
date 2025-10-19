package aufgabe4;

public class MaximalenGeldbetrag {
    public static int findeMaximalenGeldbetrag(int budget, int[] tastatur, int[] USB) {
        int max = -1;
        for (int i = 0; i < tastatur.length; i++) {
            for (int j = 0; j < USB.length; j++) {
                if (tastatur[i] + USB[j] > max && tastatur[i] + USB[j] <= budget) {
                    max =  tastatur[i] + USB[j];
                }
            }
        }
        return max;
    }
}
