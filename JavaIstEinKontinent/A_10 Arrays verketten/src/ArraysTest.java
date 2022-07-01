public class ArraysTest {
    public static void main(String[] args) {
        int[] nu = null;
        int[] nichtnu = new int[3];
        try {
            Arrays.printArr(Arrays.verkette(nu,nichtnu));
        } catch (NullPointerException e){
            System.out.println(e);
        }
        int[] alphaArr = {1,2,3};
        int[] bravoArr = {4,5,6};
        Arrays.printArr(Arrays.verkette(alphaArr,bravoArr));
    }
}
