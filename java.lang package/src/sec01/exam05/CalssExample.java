package sec01.exam05;

public class CalssExample {

	public static void main(String[] args) {
		//ù ��° ���
		Calss clazz = car.class;
		
		//�� ��° ���
		//Class clazz = Class.forName("sec01.exam08.Car");
		
		//�� ��° ���
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());

	}

}
