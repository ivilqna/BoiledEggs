package eggs;

public class TestEggs {

	public static void main(String[] args) {

	int totalEggs = 8; //����� ���� �� �����

	int minutes = 2; //������ ����� �� ������


	Eggs b = new Eggs();

	b.choosing(totalEggs); 

	b.addingEggs(totalEggs);

	b.cookertheEggs(b, minutes,totalEggs);

	}

}
