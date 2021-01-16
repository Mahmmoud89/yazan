package objekteundklassen;

public class Pkw {

	String 	hersteller;
	String 	modell;
	int 	baujahr;
	String 	farbe;
	String 	getriebvarinte;
	boolean kupplung;
	int 	preis;
	int 	leistung;
	
	
	
	
	
	
	public Pkw(String Hersteller, String Modell, int Baujahr, String Farbe, String Getriebvarinte,
			int Preis, int Leistung) {
	 
		this.hersteller = Hersteller;
		this.modell = Modell;
		this.baujahr = Baujahr;
		this.farbe = Farbe;
		this.getriebvarinte = Getriebvarinte;
		
		this.preis = Preis;
		this.leistung = Leistung;
	}





	void tunen(int tunewert) {
		
		leistung = tunewert + leistung;
		
	}
	double umrechenenleistung () {
		 double neuleistung=0;
		 neuleistung = leistung * 1.36;
		
		
		return neuleistung; 
	}
	double verbauch (double liter, double strecke) {
		
		double verbrauch = 0;
		verbrauch = liter * 100 / strecke ;
		
		return verbrauch;
		
	}
	
	
	
	
	public void Pkwinfo(){
	
		System.out.println("Hrsteller:"+ hersteller );
		System.out.println("Hrsteller:"+ modell );
		System.out.println("Hrsteller:"+ baujahr );
		System.out.println("Hrsteller:"+ farbe );
		System.out.println("Hrsteller:"+ getriebvarinte );
		System.out.println("Hrsteller:"+ kupplung );
		System.out.println("Leistung :" + leistung);
	}

}