package array;

public class DogTest {

	public static void main(String[] args) {
		Dog dog[] = new Dog[5];
		
		dog[0] = new Dog("해피", "치와와");
		dog[1] = new Dog("계피", "도베르만");
		dog[2] = new Dog("현피", "하운드");
		dog[3] = new Dog("풀피", "리트리버");
		dog[4] = new Dog("딸피", "허스키");

		for(int i = 0; i < dog.length; i++) {
			dog[i].showDogInfo();
		}
		
		System.out.println("=== 향상된 for문 사용 ===");
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}
	}

}
