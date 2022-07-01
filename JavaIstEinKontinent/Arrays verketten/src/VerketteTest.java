public class VerketteTest {
    public static void main (String[]args){
        int[] a = {1,2,3};
        // wenn elemente belamm

        int[] b = {4,5,6};
        int[] c = null;
        int[] d = new int[9];
        d = null;
        try {
            int[] zusammen = Verkette.verkette(a, c);
            Verkette.printarrayINT(zusammen);
        } catch (IllegalArgumentException e) {
            System.out.println(e);;
        }

    }

}
