public class Primfaktoren {
    public static int[] primeFactorize(int n) throws IllegalArgumentException{
//gibt fuer eine beliebige Eingabe einen array mit den Primfaktoren aus, wenn die Eingabe groesser als 1 ist
        if (n < 2) throw new IllegalArgumentException("Die Zahl muss groesser als 1 sein");
        int maximaleprimfaktoren = (int) (Math.sqrt(n)) + 1;
//gibt die maximale Anzahl von Primfaktoren grob geschaetzt
        int[] tempo = new int[maximaleprimfaktoren];
//so genau weiss ich noch nicht die anzahl der Primzahlen.
        int anzahlFaktoren = 0;
//zaehlt mir die Fakktoren
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
//sichern und erhoehern
                tempo[anzahlFaktoren++] = i;

                n = n / i;

                i = 1;
            }
        }
        int[] optimusPrime = new int[anzahlFaktoren];
        for (int i = 0; i < anzahlFaktoren; i++) {
            optimusPrime[i] = tempo[i];
//kopiert den temporaeren array in den ausgabe Array
        }
        return optimusPrime;

    }

    public static void printarray(int[] array) {
//druckt einen Array aus eingebettet in Klammern
        System.out.print("[ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("]\n");
    }
    public static int[] findCommonPrimeFactors(int[] prime1, int[] prime2) throws IllegalArgumentException{
//gibt die gemeinsamen Primfaktoren zweier zuvor erschaffenen Primfaktorzerlegungen
        if (prime1 == null || prime2 == null) throw new IllegalArgumentException("Einer oder beide der Arrays ist n u l l");
            int county = 0;
            int[] temp = new int[prime1.length];
            for (int i = 0; i < prime1.length; i++){
//die gemeinsamen Primfaktoren werden niemals mehr sein, als einer der beiden Eingaben Primfaktoren hat
                for (int j = 0; j < prime2.length; j++){
                    if (prime1[i] == prime2[j]){
                        temp[county] = prime2[j];
                        county++;
                        prime2[j] = 69;
//an der Stelle der gefundenen Uebereinstimmung wird von der zweiten Eingabe der Wert ueberschrieben. nice.
                    } else{

                    }
                }
            }
            int erg[] = new int[county];
            for (int i = 0; i < county; i++){
                erg[i] = temp[i];
            }

            return erg;
    }
    public static int calculateGgT(int no1, int no2) throws IllegalArgumentException{
//gibt den ggT auf Grundlage der Primfaktoren. Eingabe muss eine natuerliche Zahl sein
        if (no1 < 1 || no2 < 1) throw new IllegalArgumentException("Muss eine natuerliche Zahl sein");
        if (no1 == 1 || no2 == 1) return 1;
        int[] alpha = primeFactorize(no1);
        int[] bravo = primeFactorize(no2);

        int[] gem1sam = findCommonPrimeFactors(alpha,bravo);
        int erg = gem1sam[0];
        for (int i = 1; i < gem1sam.length; i++){
            erg = erg * gem1sam[i];
        }
        return erg;
    }
}