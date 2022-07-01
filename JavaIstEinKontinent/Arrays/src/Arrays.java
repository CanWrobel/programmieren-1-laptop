/*public class Arrays {
    public static boolean gleichLang (float [] arr1, float [] arr2) {
        return arr1.length == arr2.length;
    }
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }
    public static int gibElementArrayInt(int[] array, int i){
        if (i>=0){
            return array[i];
            return array[i];
    }
   // } return Integer.MIN_VALUE;
    public static int summiereArrayInt (int [] array){
        int erg = 0;
        for (int j : array) {
            erg = erg + j;
        }
//      for ( int j : array)
//          erg = erg + j;
        return erg;
    }
    public static double mittelwertArray (int[] array){
        return (double)(summiereArrayInt(array))/array.length;
    }
    public static int derGroessteArray (int[] array){
        int grossi = 0;
        for (int j : array) {
//      for (int j : array)
            if (j > grossi) {
                grossi = j;
            }
        }
        return  grossi;
    }
    public static int gibErstenIndexUngleicherElemenete(char [] arr1, char [] arr2){
        int maxcount = arr1.length;
        if (arr1.length>arr2.length){
            maxcount = arr2.length;
        }
        for (int count = 0 ; count < maxcount; count++ ){
            if (arr1[count]!=arr2[count]){
                return count;
            }
        }
        return -1;
    }
    public static char gibErstesUngleichesElement(char [] arr1, char[] arr2){
        return arr1[gibErstenIndexUngleicherElemenete(arr1,arr2)];
    }

    public static void main(String[] args) {
        float[] floaty1 = {1,2,3};
        float[] floaty2 = {4,5,6};
        float[] floaty3 = null;
        System.out.println("Test gleichlang " + gleichLang(floaty1,floaty2));
        int [] inty1 = {1,2,89,3};
        System.out.println("Test gibElement " + gibElementArrayInt(inty1,2));
        System.out.println("Test summiereArrayInt " + summiereArrayInt(inty1));
        System.out.println("TestMittelwert " + mittelwertArray(inty1));
        System.out.println("Grossi " + derGroessteArray(inty1));
        char [] charry1 = {'a', 'b', 'c', 'd', 'f'};
        char[] charry2 = {'a', 'b', 'e', 'd'};
        System.out.println("Erster index Test " + gibErstenIndexUngleicherElemenete(charry2,charry1));
        System.out.println("Test Element erster Index:  " + gibErstesUngleichesElement(charry1,charry2));
        printArray(inty1);
    }
}
