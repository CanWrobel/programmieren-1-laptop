public class Arrays {
    public static int[] verkette(int[] a, int[] b) throws NullPointerException{
        if (a == null || b == null) throw new NullPointerException("Einer ist Null");
        int[] erg = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++){
            erg[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            erg[i+a.length] = b[i];
        }
        return erg;
    }
    public static void printArr(int[] array){
        System.out.print("[ ");
        for (int j : array){
            System.out.print(j + " ");
        }
        System.out.print("]");
    }
}
