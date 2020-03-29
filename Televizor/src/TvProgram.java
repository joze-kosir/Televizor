
public class TvProgram extends Tv implements TvProgramTeletext, TvProgramIzberi{ 

	//vse lastnosti-atributi deklanirane v nadrazredu se prenesejo
	//deklariramo samo nove
	
	private String nazPrograma;
	private int sifraPrograma;	
	private boolean teletext;
	public boolean napakaProgram = false;
	
	public TvProgram(String v, int k) {
		super("SLO1",5);
		
		//inicializiramo lastnosti
		nazPrograma = v;
		setSifraPrograma(k);
		
	}

	//deklariramo nov konstruktor
	//Vhodni:šifra programa, vrne naziv programa
	public TvProgram(int k) {
		super("SLO1",k);
		if (k>0 && k<6) {
			
			// Get the Arrays 
	        String[] nazProg = { "SLO1", "SLO2", "POP TV", "TV3", "A Kanal" }; 	
			boolean[] vesTeletext = { true, false, true, false, true }; 	
			
			nazPrograma = nazProg[k-1];
			setSifraPrograma(k);
			teletext = vesTeletext[k-1];
		}	
		else{
			nazPrograma = "SLO0";
			setSifraPrograma(0);
			teletext = false;
		}
							
	}//konec

	public String getTvProgramTeletext(){
		//vrne ali program vsebuje teletext
		if (teletext==true){
			return "DA";
		}
		else{
			return "NE";
		}
	}//konec metode
	
	public String getTvProgramIzberi() {
		//vrne naziv programa
		return nazPrograma;	
	}//konec metode

	public int getSifraPrograma() {
		return sifraPrograma;
	}

	public void setSifraPrograma(int sifraPrograma) {
		this.sifraPrograma = sifraPrograma;
	}


 } 



