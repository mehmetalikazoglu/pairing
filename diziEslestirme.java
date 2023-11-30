import java.util.ArrayList;

import java.util.ArrayList;

public class diziEslestirme {

    public static void main(String[] args) {
        ArrayList<Integer> eslesenListe = new ArrayList<>();
        int[] dizi1 = {5, 6, 8, 4, 9};
        int[] dizi2 = {9, 3, 5, 6, 7};
        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi2.length; j++) {
                if (dizi1[i] == dizi2[j]) {

                    eslesenListe.add(dizi1[i]);

                }

            }
        }
        System.out.println("Eşleşen Sayılar: "+eslesenListe);
    }

}
