package sec02.exam03;

public class KumhoTire extends Tire{
	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//�޼ҵ�

	@Override
	public boolean roll() {
		++accummulationRotation;
		if(accummulationRotation<maxRotation) {
			System.out.println((location + " KumhoTire ����: " + (maxRotation-accummulationRotation) + "ȸ"));
			return true;
		}else {
			System.out.println("*** " + location + " KumhoTire ��ũ ***");
			return false;
		}
	}
	

}
