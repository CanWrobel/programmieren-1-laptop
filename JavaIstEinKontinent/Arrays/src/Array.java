
public class Array {

    public static boolean istGleichLang(float[] arr1, float[] arr2) {
        if (arr1.length == arr2.length) {
            return true;
        } else return false;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int gibElement(int[] array, int i) {
        if (i >= 0) {
            return array[i];
        } else return Integer.MIN_VALUE;
    }

    public static int summiere(int[] array) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe = summe + array[i];
        }
        return summe;
    }

    public static int mittelwert(int[] array) {
        int summe = summiere(array);
        return summe / array.length;
    }

    public static int max(int[] array) {
        int groesste = array[0];
        for (int i = 1; i < array.length; i++) {
            if (groesste < array[i]) {
                groesste = array[i];
            }
        }
        return groesste;
    }

    public static int gibErstenIndexUngleicherElemente(char[] array1, char[] array2) {
        int index = 0;
        if (array1.length == array2.length) {
            for (int i = index; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    index = i;
                    break;
                }
            } return index;
        } return -1; // -1 bedeutet ein Fehler, wenn die zwei Arrays nicht die gleiche Länge haben (was unvergleichbar ist)
    }

    public static char gibErstesUngleichesElement(char[] array1, char[] array2) {
        char character = ' ';
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    character = array1[i];
                    break;
                }
            }
        } return character;
    }

    public static void zieheZahl() {
        int[] array = new int[49];
        for (int i = 0; i <100; i++) {
            int zufallszahl= (int)(Math.random()*49 +1);
            array[zufallszahl-1]++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Die zahl " +(i +1) + " wurde " + array[i] + "-mal gezogen.");
        }
    }

    public static void main(String[] args) {

        float[] floatArr1 = new float[3];
        float[] floatArr2 = new float[3];
        int[] intArr1 = {1, 2, 4, 5};
        int[] intArr2 = {1};
        char[] charArr1 = {'Q', 'A', 'B'};
        char[] charArr2 = {'E', 'S', 'B'};


        // Methode testen mit nur deklarierten Arrays
        System.out.println(Array.istGleichLang(floatArr1, floatArr2));

        // printArray
        Array.printArray(intArr1);

        //gibElement
        System.out.println(Array.gibElement(intArr1, 1));

        //summiere
        System.out.println(Array.summiere(intArr1));

        //mittelwert
        System.out.println(Array.mittelwert(intArr1));

        // max
        System.out.println(Array.max(intArr1));
        System.out.println(Array.max(intArr2));

        // gibErstenIndexUngleicherElemente
        System.out.println(Array.gibErstenIndexUngleicherElemente(charArr1, charArr2));

        // gibErstesUngleichesElement
        System.out.println(Array.gibErstesUngleichesElement(charArr1, charArr2));

        zieheZahl();
    }
}
