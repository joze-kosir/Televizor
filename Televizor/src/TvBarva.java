
public class TvBarva extends Tv implements TvProgramBarva{ 

	//vse lastnosti-atributi deklanirane v nadrazredu se prenesejo
	//deklariramo samo nove
	
	private String barva;

	
	public TvBarva(String v, int k) {
		super("SLO1",5);
		
		//inicializiramo lastnosti
		barva = v;
		
	}
	//deklariramo nov konstruktor
	//Vhodni:šifra programa vrne barvo programa	
	public TvBarva(int b){
        super("SLO1",b);
		// Get the Arrays 
        String[] nazBarva = { "Color", "B&W", "B&W", "Color", "Color" }; 	
		
		barva = nazBarva[b-1];
			
	}//konec
	
	public String  getTvProgramBarva() {
		return barva;
	}

	
	
	
}