package aufgabe2;

public class MaximaleSummeMin1 {
    public static int findeMaximaleSummeMin1(int[] array, int min){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return sum - min;
    }
}
