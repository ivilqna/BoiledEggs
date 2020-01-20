package eggs;

import java.util.ArrayList;


public class Eggs extends Egg implements Steps{
	

	private ArrayList<Egg> totalEggs = new ArrayList<Egg>();

	private int counter = 0; 

	public void choosing(int eggCount) {
		
	System.out.println("Qicata se izmivat predvaritelno i se zalivat sys studena "
	+ "\nvoda, taka,che vodata da gi pokrie.Po tozi nachin"
	+ "\nse namalqva opasnostta ot spukvane.\n");


	System.out.println("Vzimame "+ eggCount +" qica izmivame gi s voda");

	if(eggCount >= 4) { 

	System.out.println("\nAko ima 4 qica ili poveche se slagat v golemiq sud.");

	counter++; 

	}else { 

	System.out.println("\nIma po-malko ot 4 qica se slagat v malkiq");

	counter--;
	
	}
	
	}
	
		public void addingEggs(int eggCount) {

		for(int i = 0;i<eggCount;i++) {

		Egg eggs = new Egg();

		
		totalEggs.add(eggs);}

		if(counter>0) {



		System.out.println("\nSlagame " + eggCount +" qicata v tendjarata");

		}else {

		System.out.println("\nSlagame " + eggCount +" qicata v djezveto, kanche");

		}

		}

		public void cookertheEggs (Eggs b, int minutes, int eggCount) {

		System.out.println("\nZapochvat da se varqt qicata "+ minutes + " minuti");
		{

		if(minutes < 4 && minutes < 5 ) {
		System.out.println("Rezultat:qicata stavat rohki-jultukut i golqma chast ot beltuka sa techni");

		}else if(minutes >=5) {
		System.out.println("Rezultat:qicata stavat tvurdi");
		}else {
		System.out.println("Rezultat:jultukut vse oshte e techen, a beltuka tvurd");
		}
		}
		 

		System.out.println("\nSled kato se svalqt ot ogunq, "
				+ "\nqicata se zalivat sys studena voda"
				+ "\ni se ostavqt da prestoqt nqkolko minuti. "
				+ "\nTaka se obelvat po-lesno. ");


		}
	}
