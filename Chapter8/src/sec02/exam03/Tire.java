package sec02.exam03;

public class Tire {
	//�ʵ�
	public int maxRotation;		//�ִ� ȸ����(Ÿ�̾� ����)
	public int accummulationRotation;	//���� ȸ����
	public String location;		//Ÿ�̾��� ��ġ
	
	
	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accummulationRotation;
		if(accummulationRotation < maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation-accummulationRotation) + "ȸ"); //���� ȸ��(����<�ִ�)�� ��� ����
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***"); //��ũ(����=�ִ� or ����>�ִ�)�� ��� ����
			return false;
		}
	}
}
