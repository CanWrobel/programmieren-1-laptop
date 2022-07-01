public class AlterMK2 {
    public static void main (String[]args){
        int x = 1;
        int y = 1;
        int z = 1;
        int erg = 1;
        while (x<=36){
            erg = x*y*z;
            boolean kleinergleichxy=x<=y;
            boolean kleinergleichz=y<=z;
            boolean erg36= erg==36;
            if(kleinergleichxy&&kleinergleichz&&erg36){
                System.out.println(erg+(" = "+x+" * "+y+" * "+z+" = x * y * z; das aufaddierte Alter ist die Hausnummer = "+(x+y+z)));
            }
            z=z+1;
            //System.out.println(x+" "+y+" "+z+" "+erg);
            if(z>36){
                z=1;
                y=y+1;
            }
            if(y>=36){
                y=1;
                x=x+1;
            }

        }
        System.out.println("Ende erreicht");

    }
}
