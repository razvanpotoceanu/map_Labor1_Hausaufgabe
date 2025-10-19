package aufgabe4;

public class TeuerstesUsbFurBudget {
    public static int findeTeuerstesUsbFurBudget(int[] preise, int budget){
        int max = -1;
        for(int i=0; i<preise.length; i++){
            if((preise[i] <= budget) && (preise[i] > max)){
                max = preise[i];
            }
        }
        if (max != -1) return max;
        else return -1;
    }
}
