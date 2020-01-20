package eggs;

public class TestEggs {

	public static void main(String[] args) {

	int totalEggs = 8; //Kolko qica shte varish

	int minutes = 2; //Izberi vreme za varene


	Eggs b = new Eggs();

	b.choosing(totalEggs); 

	b.addingEggs(totalEggs);

	b.cookertheEggs(b, minutes,totalEggs);

	}

}
