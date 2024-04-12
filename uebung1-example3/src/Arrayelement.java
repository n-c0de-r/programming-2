public class Arrayelement {

    public static byte[] haeufigstesElem(byte[] byteArray) {
        // Erstellt ein Array das zählt wie oft jedes Element vorkommt
        int[] häufigkeitsArray = erstelleHäufigkeitsarray(byteArray);

        // Sucht größtes Element im Häufigkeitsarray
        int max = findeMax(häufigkeitsArray);

        // Zählt wie oft Wert vorkommt
        int anzahlMax = zähleAnzahlgesuchterElemente(häufigkeitsArray, max);

        // Erstellt neues Array mit richtiger Länge
        byte[] haeufigsteElem = new byte[anzahlMax];

        // Sucht Max Element im Häufigkeitsarray und fügt das Element vom selben Index
        // vom byteArray ein
        for (int i = 0, j = 0; i < anzahlMax && j < häufigkeitsArray.length; j++) {
            if (häufigkeitsArray[j] == max) {
                haeufigsteElem[i] = byteArray[j];
                i++;
            }
        }

        return haeufigsteElem;

    }

    // Erstellt ein Häufigkeitsarray mit Häufigkeiten zu jedem Element
    private static int[] erstelleHäufigkeitsarray(byte[] byteArray) {
        // häufigkeitsArray zählt für jede Position, wie oft sie vorkommt
        int[] häufigkeitsArray = new int[byteArray.length];

        // befüllt häufigkeitsArray
        for (int i = 0; i < byteArray.length; i++) {
            int count = 0;
            for (int j = i; j < byteArray.length; j++) {
                if (byteArray[i] == byteArray[j]) {
                    count += 1;
                }
            }

            häufigkeitsArray[i] = count;
        }

        return häufigkeitsArray;
    }

    // findet größten Wert im Array
    private static int findeMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Zählt wie oft Element in Array vorkommt
    private static int zähleAnzahlgesuchterElemente(int[] arr, int elem) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                count++;
            }
        }
        return count;
    }

}
