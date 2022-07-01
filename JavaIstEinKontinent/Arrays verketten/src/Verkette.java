public class Verkette {
    public static int[] verkette (int[] a, int[] b) throws IllegalArgumentException{
        if (a == null || b == null) throw new IllegalArgumentException("Einer ist n u l l");

        int[] verkettet = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++){
            verkettet[i] = a[i];
        }
        for (int i = a.length; i < verkettet.length; i++){
            verkettet[i] = b[i-a.length];
        }
        //int... zum array deklariert nur den datentypen
        return verkettet;
    }
    public static void printarrayINT (int[] array){
        for (int j : array){
            System.out.println(j);
        }
    }
    public static int suche (int[] array, int wert){

    }
}
