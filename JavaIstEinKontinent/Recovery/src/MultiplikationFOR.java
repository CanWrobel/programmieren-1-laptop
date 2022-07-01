public class MultiplikationFOR {
    public static int multipliziere(int x, int y) {
        int erg = 0;
        for (int count = 0; count < y; count++) {
            erg = erg + x;
        }
        for (int count = 0; count > y; count--) {
            erg = erg - x;
        }
        return erg;
    }

        public static void main (String[] args){
            int x = 5;
            int y = -3;
            System.out.println(multipliziere(x,y));
        }

        }
        /*
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
}
*/