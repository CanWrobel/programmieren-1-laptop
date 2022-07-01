public class Zahlenziehung {
    public static int zieheZahl(int von, int bis){
        return (int)(Math.random()*bis+von);
    }
    public static void main (String[]args){
        int von = 1;
        int bis = 49;
        int[][] doppelterArr = new int[bis+1][1];
        int anzahlZiehungen = 30;
        int aktuellGezogeneZahl;
        for (int i = 0; i < anzahlZiehungen; i++){
            aktuellGezogeneZahl= zieheZahl(von,bis);
            doppelterArr[aktuellGezogeneZahl][0] += 1;
            //hi felix kann das klappen
            System.out.println("Ziehung nr " + i + " ist " + aktuellGezogeneZahl);
        }
        for (int i = 1; i < doppelterArr.length; i++){
            System.out.println("Die Zahl " + i + " wurde " + doppelterArr[i][0] + " mal gezogen");
        }
    }
}
