package array;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> library = new ArrayList<Dog>();
		
		library.add(new Dog("해피", "치와와"));
		library.add(new Dog("계피", "도베르만"));
		library.add(new Dog("현피", "하운드"));
		library.add(new Dog("풀피", "리트리버"));
		library.add(new Dog("딸피", "허스키"));
		
		
		for (Dog d : library) {
			System.out.println(d.showDogInfo());
		}
	}

}
