
public class TennisSpielerin {
	private String name;
	private int alter;
	private int startNummer;
	
	public TennisSpielerin(String name, int alter, int startNummer) {
		setName(name);
		setAlter(alter);
		setStartNummer(startNummer);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAlter(int alter) {
		if (alter < 7) {
			// Mindestalter = 8
			System.out.println("Bitte geben Sie einen g�ltigen Alter! Die Spielerin m�ss mindestens 8 Jahre alt sein.");
		} else this.alter = alter;
	}
	
	public void setStartNummer(int nummer) {
		if (nummer < 0) {
			System.out.println("Bitte geben Sie f�r die Startnummer eine positive nummer!");
		} else startNummer = nummer;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAlter() {
		return alter;
	}
	
	public int getStartnummer() {
		return startNummer;
	}
	
	public void getInfo() {
		System.out.println("Name: " +name + "\tAlter: " +alter +"\tStartnummer: " +startNummer);
	}
	
}
