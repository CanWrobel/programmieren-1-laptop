public class Aufgabe4_2 {
    public static int multipliziere(int x, int y) {
        int count = 0;
        int erg = 0;

        while (count < y){
            erg = erg + x;
            count = count +1;
        }
        while (count > y){
            erg = erg -x;
            count = count-1;
        }

        return erg;
    }
    public static void main (String[]args){
        int x=-5;
        int y=-100;
        System.out.println(multipliziere(x,y));
    }
}
