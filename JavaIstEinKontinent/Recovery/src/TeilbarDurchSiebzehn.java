import java.util.Scanner;

public class TeilbarDurchSiebzehn {
    public static int Anzahlderstellen(int eingabe) {
        int count = 0;
        while (eingabe != 0) {
            eingabe = eingabe / 10;
            count = count + 1;
        }
        return count;
    }

    //diese Methode gibt einem die Anzahl der Stellen einer Eingabe als int-Wert. Vorher habe ich eine vorgefertigte Methode benutzt.
    //das ist aber nicht Sinn und Zweck dieser Abgabe. Hier also die Methode
    public static void main (String[]args) {

        int zahl = 2149; //die Eingabe hierher oder den scanner fragen wenn der Scanner nicht auskommentiert ist
        System.out.print("Bitte eine natuerliche Zahl eingeben: ");
        Scanner scan = new Scanner(System.in);
        zahl = scan.nextInt();
        System.out.println("Die eingelesene Zahl lautet: " + zahl);
        //den Scanner habe ich stumpf raus kopiert aus den Folien;
        int z1 = zahl % 10; //die erste Ziffer
        int erg = z1 * 5 - (zahl/10%10); // der erste Schritt, Ziffer 1 u 2 irrelevant ab hier
        int length = Anzahlderstellen(zahl);
        //int length = String.valueOf(zahl).length(); hatte ich vorher benutzt, da ich nicht wusste wie man eine Methode schreibt.
        int loopready = zahl/100;
        //die Zahl wie sie in der Eingabe war, ist so nicht mehr relevant. Die obere Variable macht sie bereit, um sie dem Loop zu füttern
        int loop = length-2;
        //wie oft wird geloopt
        int count = 0; //meine zählvariable <3 forloops sind schwer zu lesen
        //---System.out.println(zahl+" ist die Eingabe. "+erg+" ist der Ausgang für den Loop. "+length+" ist die Ziffernanzahl. "+loopready+" ist die Eingabe relevant für den Loop. "+loop+" mal den loop. ");
        while (count < loop) {
            boolean even = count % 2 == 0;
            if (even==true){
                erg=erg*5+(loopready%10);
                loopready=loopready/10;
            }
            else {
                erg=erg*5-(loopready%10);
                loopready=loopready/10;
            }
            //addiert und subtrahiert abwechselnd
            //    System.out.print(erg+" Ergebnis, "+loop+" mal berechnet "+even+" plus // "); System.out.println("");
            count = count+1;
        }
        boolean ergebnis17 = erg%17==0;
        boolean eingabezahl17 = zahl%17==0;
        System.out.println("Eingabezahl: "+zahl);
        System.out.println("Ergebnis: "+erg);
        System.out.println("Ergebnis ist durch 17 teilbar: "+ergebnis17);
        System.out.println("Eingabe ist durch 17 teilbar: "+eingabezahl17);


    }

}
