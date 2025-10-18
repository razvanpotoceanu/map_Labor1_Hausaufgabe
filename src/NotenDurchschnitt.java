public class NotenDurchschnitt {
    public static double findeNotenDurchschnitt(int[] noten)
    {
        double sum = 0;
        for(int i = 0; i < noten.length; i++)
        {
            sum += noten[i];
        }
        return sum/noten.length;
    }
}
