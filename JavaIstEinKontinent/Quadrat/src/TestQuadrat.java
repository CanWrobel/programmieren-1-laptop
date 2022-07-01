public class TestQuadrat {
    public static String deutschBool(boolean rein) {
        // ich mache prints von boolean schoen. Static nicht vergessen!
        if (rein) {
            return " Ja das stimmt";
        } else {
            return " Ne stimmt nicht";
        }
    }
    public static void main (String[]args){
        Quadrat q1 = new Quadrat(6);
        Quadrat q2 = new Quadrat(9);
        System.out.println("Die Flaeche von q1 = " + q1.getFlaeche());
        double faktorQ1 = 1.5;
        q1.skaliereQuadrat(faktorQ1);
        System.out.println("Die Breite von q1 ist nach dem skalieren mit " + faktorQ1 + " = " + q1.getBreite() + " ");
        System.out.println("Die Diagonale von q2 = " + q2.berechneDiagonale());
        System.out.println("Sind die beiden Quadrate gleich? " + deutschBool(q1.vergleicheQuadrate(q2)));
        System.out.println(q1.canVergleicheQuadrate(q1,q2));
    }
}
