package sec02.exam03;

public class HankookTire extends Tire{
	//�ʵ�
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//�޼ҵ�

	@Override
	public boolean roll() {
		++accummulationRotation;
		if(accummulationRotation<maxRotation) {
			System.out.println((location + " HankookTire ����: " + (maxRotation-accummulationRotation) + "ȸ"));
			return true;
		}else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
	

}
