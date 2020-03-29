import java.io.*;

public class Televizor {
	public static BufferedReader in;
	
	
	public static void main(String[] args) throws Exception {

		//inicializiramo lastnosti
		in = new BufferedReader(new InputStreamReader(System.in));
		
		int tvProgram = 1;
	
		// VERZIJA 2
		//vnesemo šifro programa 
		try {
			System.out.print("Vnesite številko program od 1 do 5:");
			tvProgram = Integer.parseInt(in.readLine());
//			if(tvProgram<1 || tvProgram>5) {
//				tvProgram = 1;

//			}
		}
		catch(Exception e) {
			System.out.println("Napaka, prazen vnos..."); 
			// izhod
			System.exit(0); 
		}
		
		int tvGlasnost = 0;
		try {
			System.out.print("Vnesite število za koliko povečamo oz. zmanjšamo glasnost:");
			tvGlasnost = Integer.parseInt(in.readLine());
			
		}
		catch(Exception e) {
			System.out.println("Glasnost ostaja enaka!!"); 
		}
		

		
		//ustvarimo nov objekt tipa tv deklariramo in inicializiramo
		Tv tv1 = new Tv("Philips", tvProgram);  //znamka tv-ja
		//prižgemo televizor
		tv1.vklopiTv();	

		
		try {
			tvProgram = tv1.getProgramSifra();
			
		}
		catch(Exception e){		
			System.err.println("Napaka - " + e);
			System.exit(0); 
		}
		
		//izpišemo znamko tv-ja
		System.out.println ("Moja nova tv je " + tv1.getZnamka() + ".");
		//izpišemo privzeti program
//		System.out.println ("Privzeti program je " + tvProgram);	
			
		//izpišemo privzeto glasnost
		System.out.println ("Privzeti glasnost je " + tv1.getNastaviJakost(0));	
		

			
		//nastavimo nov program ter glasnost
		TvProgram newTvProgram  = new TvProgram(tvProgram);	
		TvBarva newTvProgramBarva  = new TvBarva(tvProgram);
		newTvProgram.vklopiTv();
		System.out.println ("Novi program je " + newTvProgram.getTvProgramIzberi());
		System.out.println ("Novi program vsebuje teletext: " + newTvProgram.getTvProgramTeletext());
		System.out.println ("Novi program ima barvo: " + newTvProgramBarva.getTvProgramBarva());
		System.out.println ("Novi program ima jakost zvoka: " + newTvProgram.getNastaviJakost(tvGlasnost));

		
		
		
	}

}
