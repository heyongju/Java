package array;

public class DogTest {

	public static void main(String[] args) {
		Dog dog[] = new Dog[5];
		
		dog[0] = new Dog("����", "ġ�Ϳ�");
		dog[1] = new Dog("����", "��������");
		dog[2] = new Dog("����", "�Ͽ��");
		dog[3] = new Dog("Ǯ��", "��Ʈ����");
		dog[4] = new Dog("����", "�㽺Ű");

		for(int i = 0; i < dog.length; i++) {
			dog[i].showDogInfo();
		}
		
		System.out.println("=== ���� for�� ��� ===");
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}
	}

}
