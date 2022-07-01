public class Punkt {
    private static int UNTERGRENZE = -10;
    private static int OBERGRENZE = 10;
    private int x;

    private int y;

    public void verschiebeInnerhalb (int deltaX, int deltaY){
        boolean imBereichX = (x + deltaX) >= UNTERGRENZE && (x + deltaX) <= OBERGRENZE;
        boolean imBereichY = (y + deltaY) >= UNTERGRENZE && (y + deltaY) <= OBERGRENZE;
        boolean imBereich = imBereichX && imBereichY;
        if (imBereich){
            verschiebe(deltaX,deltaY);
        }
    }

    public void setX (int i) {

        x = i;

    }

    public void setY (int i) {

        y = i;

    }

    public void verschiebe(int deltaX, int deltaY){

        x = x + deltaX;

        y = y + deltaY;

    }

    public int verschiebeUebereinanderX (Punkt p){
        int x = 0;   //dx=x ist das x vom Aufrufer gemeint
        return x;
    }

    public static int metgetDx (Punkt p1, Punkt p2){
        int dx = p2.x - p1.x ;
       return dx;
    }
    public static int metgetDy (Punkt p1, Punkt p2){
        int dy = p2.y - p1.y ;
        return dy;
    }



    public int getX(){

        return x;

    }

    public int getY(){

        return y;

    }
    public void verschiebeUmEins() {
        x = x + 1 ;
        y = y + 1 ;
    }
    public boolean istUrsprung() {
        boolean istUrsprung = x == 0 && y == 0 ;
        return istUrsprung;
    }

}