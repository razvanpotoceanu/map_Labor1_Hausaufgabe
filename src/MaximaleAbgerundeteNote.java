public class MaximaleAbgerundeteNote {
    public static int findeMaximaleAbgerundeteNote(int[] abgerundeteNote){
        int max = abgerundeteNote[0];
        for(int i = 1; i < abgerundeteNote.length; i++){
            if(abgerundeteNote[i] > max){
                max = abgerundeteNote[i];
            }
        }
        return max;
    }
}
