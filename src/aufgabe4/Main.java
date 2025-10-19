package aufgabe4;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //aufgabe1

        int[] tastaturen = {40,35, 70, 15, 45, 10};
        System.out.println("Die billigste Tastatur: "+ BilligsteTastatur.findeBilligsteTastatur(tastaturen));


        //aufgabe2

        int[] tastatur = {15, 20, 10, 35};
        int[] USB = {20,15,40,15};
        System.out.println("den teuersten Gegenstand:" + TeuerstenGegenstand.findeTeuerstenGegenstand(tastatur, USB));


        //aufgabe3
        int[] Preise = {15,45,20};
        int Budget = 30;
        System.out.println("das teuerste USB Laufwerk, das Markus kaufen kann: " + TeuerstesUsbFurBudget.findeTeuerstesUsbFurBudget(Preise, Budget));

        //aufgabe4
        int budget = 60;
        int[] tastaturen2 = {40, 60};
        int[] USB2 = {8,12};

        System.out.println("den maximalen Geldbetrag: " + MaximalenGeldbetrag.findeMaximalenGeldbetrag(budget, tastaturen2, USB2));

    }
}
