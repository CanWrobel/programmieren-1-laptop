public class Tennisspielerin {
    private String name;
    private int alter;
    private int startnummer;
    public Tennisspielerin(String name, int alter, int startnummer){
        this.name = name;
        if(alter<5) {
            System.out.println("fehler");
        } else {
            this.alter = alter;
        }
        this.startnummer= startnummer;

    }


    public void setName(String name) {

        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    public String getName(){
        return name;
    }
    public int getAlter(){
        return alter;
    }
    public void printspieler(){
        System.out.println("Name: " + name + "Alter: " + alter + "      Startnummer: " + startnummer);
    }

}
