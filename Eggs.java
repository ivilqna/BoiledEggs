package eggs;

import java.util.ArrayList;


public class Eggs extends Egg implements Steps{
	

	private ArrayList<Egg> totalEggs = new ArrayList<Egg>();

	private int counter = 0; 

	public void choosing(int eggCount) {
		
	System.out.println("������ �� ������� ������������� � �� ������� ��� ������� "
	+ "\n����, ����, �� ������ �� �� ������. �� ���� �����"
	+ "\n�� �������� ���������� �� ��������.\n");


	System.out.println("������� "+ eggCount +" ���� �������� �� � ����");

	if(eggCount >= 4) { 

	System.out.println("\n��� ��� 4 ����  ��� ������  �� ������ � ������� ���.");

	counter++; 

	}else { 

	System.out.println("\n��� ��-����� �� 4 ���� �� ������ � ������ ");

	counter--;
	
	}
	
	}
	
		public void addingEggs(int eggCount) {

		for(int i = 0;i<eggCount;i++) {

		Egg eggs = new Egg();

		
		totalEggs.add(eggs);}

		if(counter>0) {



		System.out.println("\n������� " + eggCount +" ���� � ����������");

		}else {

		System.out.println("\n������� " + eggCount +" ���� � ��������,�����");

		}

		}

		public void cookertheEggs (Eggs b, int minutes, int eggCount) {

		System.out.println("\n�������� �� �� ����� ������ �� "+ minutes + " ������");
		{

		if(minutes < 4 && minutes < 5 ) {
		System.out.println("��������:������ ������ ����� � �������� � ������ ���� �� ������� �� �����");

		}else if(minutes >=5) {
		System.out.println("��������:������ ������ ������");
		}else {
		System.out.println("��������:�������� ��� ��� � �����, � �������� �����");
		}
		}
		 

		System.out.println("\n���� ���� �� ������ �� �����, "
				+ "\n������ �� ������� ��� ������� ����"
				+ "\n� �� ������� �� �������� ������� ������. "
				+ "\n���� �� ������� ��-�����. ");


		}
	}
