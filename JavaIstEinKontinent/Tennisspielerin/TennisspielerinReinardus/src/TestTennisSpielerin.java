
public class TestTennisSpielerin {
	public static void main(String[] args) {
		
		/*
		TennisSpielerin spieler1 = new TennisSpielerin();
		TennisSpielerin spieler2 = new TennisSpielerin();
		TennisSpielerin spieler3 = new TennisSpielerin();
		
		spieler1.setName("Maier"); spieler1.setAlter(18);
		spieler2.setName("Schmidt"); spieler1.setAlter(45);
		spieler1.setName("Berger"); spieler1.setAlter(36);
		*/
		
		TennisSpielerin spielerin1 = new TennisSpielerin("Maier", 3, 44);
		TennisSpielerin spielerin2 = new TennisSpielerin("Schmidt", 45, 22);
		TennisSpielerin spielerin3 = new TennisSpielerin("Berger", 36, 77);
		
		//spielerin1.setAlter(6);
		//spielerin2.setStartNummer(-2);
		spielerin1.getInfo();
		spielerin2.getInfo();
		spielerin3.getInfo();
		
	}
}
