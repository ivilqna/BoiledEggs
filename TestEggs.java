package eggs;

public class TestEggs {

	public static void main(String[] args) {

	int totalEggs = 8; //Колко яйца ще вариш

	int minutes = 2; //Избери време за варене


	Eggs b = new Eggs();

	b.choosing(totalEggs); 

	b.addingEggs(totalEggs);

	b.cookertheEggs(b, minutes,totalEggs);

	}

}
