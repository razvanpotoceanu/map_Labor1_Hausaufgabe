package aufgabe3;

public class Division {
    public static int[] divisionMitZiffer(int[] array, int ziffer){
     int n = array.length;
     int[] result = new int[n];
     int remainder  = 0;

     for (int i = 0; i < n; i++){
         int num = remainder * 10 + array[i];
         result[i] = num / ziffer;
         remainder = num % ziffer;
     }
     return result;
    }
}
