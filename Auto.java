package objekteundklassen;

public class Auto {
	public static void main(String[] args) {

		// Pkw p1 = new Pkw();
		// p1.hersteller = "BMW";
		// p1.modell = "jazan";
		// p1.baujahr = 2010;
		// p1.farbe = "schwarz";
		// p1.getriebvarinte ="a";
		// p1.kupplung = true;
		// p1.leistung= 50;
		
		Pkw p1 = new Pkw("BMW", "jazan", 2010, "schwarz", "a", 100, 50) ;
		
		
		p1.Pkwinfo();

	}
}
