public class Aufgabe4_2multiplikationmitif {
    public static int multipliziere (int x, int y){
        int erg = 0;
        if (y<0){
            for(int count = 0; count > y; count++) {
                erg = erg - x;
            }
        } else {
            for(int count = 0; count < y; count++){
                erg = erg + x;
            }
        }

        return erg;
    }
    public static void main (String[]args){
        int x = 5;
        int y = -3;
        System.out.println(multipliziere(x,y));
    }
}
