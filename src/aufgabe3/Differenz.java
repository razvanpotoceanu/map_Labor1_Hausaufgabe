package aufgabe3;

public class Differenz {
    public static int[] findeDifferenz(int[] array1, int[] array2){
        int[] result = new int[array1.length];
        int borrow = 0;
        int diff = 0;
        for(int i = array1.length - 1; i >= 0; i--){
            diff =  array1[i] - array2[i] - borrow;
            if (diff < 0){
                diff += 10;
                borrow = 1;
            }
            else{
                borrow = 0;
            }
            result[i] = diff;
        }
        return result;
    }
}
