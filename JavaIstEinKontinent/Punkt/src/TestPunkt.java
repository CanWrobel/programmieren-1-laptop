public class TestPunkt {
    public static void metPunkteubereinander (Punkt x, Punkt y){

    }
    public static void main (String[] args){

        Punkt p2 = new Punkt();
        int p2x = 2;
        int p2y = 2;
        p2.setX(p2x); p2.setY(p2y);

        Punkt p3 = new Punkt();
        int p3x = 5;
        int p3y = 5;
        p3.setX(p3x); p3.setY(p3y);

        p2.metgetDx(p2,p3);
        System.out.println("Punkt p2 x " + p2.getX() + " y " + p2.getY());
        System.out.println("Punkt p3 x " + p3.getX() + " y " + p3.getY());
        System.out.println("Delta p2 zu p3 x " + p2.metgetDx(p2,p3) + " y " + p2.metgetDy(p2,p3));
        p2.setX(p2.getX() + p2.metgetDx(p2,p3));
        p2.setY(p2.getY() + p2.metgetDy(p2,p3));
        System.out.println("Punkt p2 verschoben zu p3 x " + p2.getX() + " y " + p2.getY());
        int deltaX = -20;
        int deltaY = -5;
        p2.verschiebeInnerhalb(deltaX,deltaY);
        System.out.println("Punkt p2 innerhalb x " + p2.getX() + " y " + p2.getY() + " verschoben um " + deltaX + " und " + deltaY);




    }

}
/*
        Punkt p1 = new Punkt();

        p1.setX(1); p1.setY(2);

          /* Lassen Sie hier die x- und y-Koordinaten von p1 auf der

          Konsole ausgeben, aber in einer Zeile und durch Komma

          getrennt */

/*        p1.verschiebe(2,2);

        System.out.println(p1.getX() + ", " + p1.getY()); //Ausgabe: 3

        //System.out.println(p1.getY()); //Ausgabe: 4
        //Verschieben Sie p1 um den Vektor (1,-3)
        p1.verschiebe(1,-3);

        //Lassen Sie die x- und y-Koordinaten von p1 ausgeben
        System.out.println(p1.getX() + ", " + p1.getY()); //Ausgabe: --

        //Erzeugen Sie den zweiten Punkt p2 = (3,5)
        Punkt p2 = new Punkt();
        p2.setX(3);
        p2.setY(5);

        //Verschieben Sie p2 um den Vektor (0,0)
        p2.verschiebe(0,0);
        //Lassen Sie die x- und y-Koordinaten von p2 ausgeben
        System.out.println(p2.getX() + ", " + p2.getY());
        //Erzeugen Sie den dritten Punkt p3 = (2,4)
        Punkt p3 = new Punkt ();
        p3.setX(0);
        p3.setY(0);
        p1.verschiebeUmEins();
        System.out.println(p1.getX() + ", " + p1.getY());
        //neue Methode verschiebe um 1
        System.out.println("Ist Ursprung?: p3 " + p3.istUrsprung() );
        */