package aufgabe3;

public class Summe {
    public static int[] findeSumme(int[] array1,  int[] array2){
        int[] result = new int[array1.length + 1];
        int carry = 0;
        int sum = 0;
        for(int i=array1.length - 1; i>=0; i--){
            sum = array1[i] + array2[i] + carry;
            result[i+1] = sum%10;
            carry = sum/10;
        }
        result[0] = carry;
        return result;
    }
}
