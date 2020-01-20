package eggs;

import java.util.ArrayList;


public class Eggs extends Egg implements Steps{
	

	private ArrayList<Egg> totalEggs = new ArrayList<Egg>();

	private int counter = 0; 

	public void choosing(int eggCount) {
		
	System.out.println("Яйцата се измиват предварително и се заливат със студена "
	+ "\nвода, така, че водата да ги покрие. По този начин"
	+ "\nсе намалява опасността от спукване.\n");


	System.out.println("Взимаме "+ eggCount +" яйца измиваме ги с вода");

	if(eggCount >= 4) { 

	System.out.println("\nАко има 4 яйца  или повече  се слагат в големия съд.");

	counter++; 

	}else { 

	System.out.println("\nИма по-малко от 4 яйца се слагат в малкия ");

	counter--;
	
	}
	
	}
	
		public void addingEggs(int eggCount) {

		for(int i = 0;i<eggCount;i++) {

		Egg eggs = new Egg();

		
		totalEggs.add(eggs);}

		if(counter>0) {



		System.out.println("\nСлагаме " + eggCount +" яйца в тенджарата");

		}else {

		System.out.println("\nСлагаме " + eggCount +" яйца в джезвето,канче");

		}

		}

		public void cookertheEggs (Eggs b, int minutes, int eggCount) {

		System.out.println("\nЗапочват да се варят яйцата за "+ minutes + " минути");
		{

		if(minutes < 4 && minutes < 5 ) {
		System.out.println("Резултат:яйцата стават рохки – жълтъкът и голяма част от белтъка са течни");

		}else if(minutes >=5) {
		System.out.println("Резултат:яйцата стават твърди");
		}else {
		System.out.println("Резултат:жълтъкът все още е течен, а белтъкът твърд");
		}
		}
		 

		System.out.println("\nСлед като се свалят от огъня, "
				+ "\nяйцата се заливат със студена вода"
				+ "\nи се оставят да престоят няколко минути. "
				+ "\nТака се обелват по-лесно. ");


		}
	}
