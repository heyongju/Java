package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println(); //InterfaceA������ methodA()�� ȣ�� ����
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println(); //InterfaceB ������ methodB()�� ȣ�� ����
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();  //InterfaceC ������ methodA,B,C() ��� ȣ�� ���� 

	}

}
