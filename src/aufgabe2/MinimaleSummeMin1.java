package aufgabe2;

public class MinimaleSummeMin1 {
    public static int findeMinimaleSummeMin1(int[] array, int max){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return sum - max;
    }
}
