package aufgabe2;

public class MaximaleZahl {
    public static int findeMaximaleZahl(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if  (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
