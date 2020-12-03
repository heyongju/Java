package classex;

public class Classex {

	public static void main(String[] args) throws ClassNotFoundException{
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());  //Object의 getClass() 메서드 사용하기
		
		Class pClass2 = Person.class; //직접 class 파일 대입하기
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());

	}

}
