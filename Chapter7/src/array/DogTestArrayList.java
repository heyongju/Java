package array;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> library = new ArrayList<Dog>();
		
		library.add(new Dog("����", "ġ�Ϳ�"));
		library.add(new Dog("����", "��������"));
		library.add(new Dog("����", "�Ͽ��"));
		library.add(new Dog("Ǯ��", "��Ʈ����"));
		library.add(new Dog("����", "�㽺Ű"));
		
		
		for (Dog d : library) {
			System.out.println(d.showDogInfo());
		}
	}

}
