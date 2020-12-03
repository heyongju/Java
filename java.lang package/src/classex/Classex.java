package classex;

public class Classex {

	public static void main(String[] args) throws ClassNotFoundException{
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());  //Object�� getClass() �޼��� ����ϱ�
		
		Class pClass2 = Person.class; //���� class ���� �����ϱ�
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());

	}

}
