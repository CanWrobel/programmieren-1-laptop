public class Primfak {
    public static int[] primeFactorize(int number){
        int gefundenePrimzahlen = 0;
        int[] primzahlbunker = new int[1000];
        int momentanePrimzahl;
        int erg;
        for (int i = 2; i <= number; i++) {
            if (i == number) break;
            if (number % i == 0) {
                primzahlbunker[gefundenePrimzahlen] = i;
                gefundenePrimzahlen++;

                number = number / i;
               i = 1;
            }
        }
        int[] nerg = new int[gefundenePrimzahlen+1];
        for (int i = 0; i < gefundenePrimzahlen; i++){
            nerg[i] = primzahlbunker[i];
        }
        return nerg;
    }
    public static void printarray(int[] array){
        for (int j : array){
            System.out.print("[");
            System.out.print(j + " ");
            System.out.print("]");
        }
    }
}
