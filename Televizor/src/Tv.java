public class Tv {
	
	//delkariramo lastnosti
	private String znamka;
	private int programSifra; 
	private boolean jeVklopljena;
	private float glasnost;
	private String glasnostNaziv;
	
	public Tv(String v, int k) {
		//inicializiramo lastnosti
		znamka = v;
		programSifra = k;
		jeVklopljena = false;
		glasnost = 30;
		glasnostNaziv = "Normalno";
	}	
	//metoda ki vrne znamko
	public String getZnamka() {
		//vrne vrednsot latnosti količinaVsebine
		return znamka;
	}	//zaključek metode	
		
	//metoda ki vrne program sifro
	public int getProgramSifra() throws Exception {
		//vrne vrednsot latnosti količinaVsebine
		
		if(programSifra < 1 || programSifra > 5) {
			programSifra = 0;
			throw new Exception("Tega programa ni na listi!!");
		}		
		
		return programSifra;

	}	//zaključek metode			
				
	//metoda za premikanje po programih
	//Vhod: jakost ki jo žeilimo
	//Vrne: stopnjo jakosti	
	public String getNastaviJakost(float jak){
		if(jeVklopljena){

			//povečamo ali zmanjšamo jakost zvoka 
			glasnost +=jak;
			if (glasnost <=30){
				//deklariramo glasnost zvoka 	
				glasnostNaziv = "Tiho";				
			}
			else if(glasnost >30 && glasnost<=70){
				glasnostNaziv = "Normalno";

			}
			else if(glasnost>70){
				glasnostNaziv = "Glasno";

			}			
			//nastavimo še procent glasnosti			
			if (glasnost<0){
				glasnost = 0;

			}else if(glasnost>100){
				glasnost = 100;
			}	
			glasnostNaziv = glasnostNaziv + "-" + glasnost + "%";
			return glasnostNaziv;
		}
		else{
			glasnostNaziv = "TV je ugasnjen!!";
			return glasnostNaziv;
		
		} //konec ifa		
	}	

	//vklopi televizijo
	public boolean vklopiTv(){
		//Postavimo jeVklopljena na true - vžegemo tv
		jeVklopljena = true;
		return true;
		
		
	} //konec kosntruktorja
	

	
		
}//class
