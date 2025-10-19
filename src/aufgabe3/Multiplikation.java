package aufgabe3;

public class Multiplikation {
    public static int[] multipliziereMitZiffer(int[] array1, int a) {
        int n = array1.length;
        int[] result = new int[n+1];
        int carry = 0;

        for (int i = n-1; i >= 0; i--) {
            int product = array1[i] * a + carry;
            result[i+1] = product % 10;
            carry = product / 10;
        }
        result[0] = carry;
        return result;
    }
}
