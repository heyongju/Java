package sec01.exam05;

public class CalssExample {

	public static void main(String[] args) {
		//첫 번째 방법
		Calss clazz = car.class;
		
		//두 번째 방법
		//Class clazz = Class.forName("sec01.exam08.Car");
		
		//세 번째 방법
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());

	}

}
