public class PrimfaktorenTest {
    public static void main(String[] args) {
//hi, in dieser Main-Methode werden zwei Zahlenpaare verglichen. 1. Paar: alpha, bravo; 2. Paar: charlie, delta. Keine magic numbers.
        int alpha = 7644;
        int bravo = 330;
        try {
            System.out.print("Primfaktoren von " + alpha + ":\t\t");
            Primfaktoren.printarray(Primfaktoren.primeFactorize(alpha));
        } catch (IllegalArgumentException e) {
            System.out.print(e);
        }
        try {System.out.print("Primfaktoren von " + bravo + ":\t\t");
            Primfaktoren.printarray(Primfaktoren.primeFactorize(bravo));
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
        System.out.print("Gemeinsame Primfaktoren:\t");
        try {
            Primfaktoren.printarray(Primfaktoren.findCommonPrimeFactors(Primfaktoren.primeFactorize(alpha), Primfaktoren.primeFactorize(bravo)));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.print("ggT von " + alpha + " und " + bravo + ":\t\t");
        try {
            System.out.print(Primfaktoren.calculateGgT(alpha,bravo));
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
        int charlie = 1;
        int delta = 130;
        System.out.print("\nPrimfaktoren von " + charlie + ": ");
        try {
            Primfaktoren.printarray(Primfaktoren.primeFactorize(charlie));
        } catch (IllegalArgumentException e) {
            System.out.print("\t\tZahl muss groesser  als 1 sein\n");
        }
        System.out.print("Primfaktoren von " + delta + ":\t\t");
        try {
            Primfaktoren.printarray(Primfaktoren.primeFactorize(delta));
        } catch (IllegalArgumentException e){
            System.out.print("\t\tZahl muss groesser  als 1 sein");
        }
        System.out.print("ggT von " + charlie + " und " + delta + ": ");
        try {
            System.out.print("\t\t\t" + Primfaktoren.calculateGgT( charlie, delta));
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }


    }
}
