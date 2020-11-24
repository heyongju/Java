package inheritance;

public class VIPCustomer extends Customer{
	private int agentID; // VIP�� ��� ���� ���̵�
	double saleRatio; //������
	
	public VIPCustomer(int customerID, String customerName, int agentID) {  //����Ʈ ������
		super(customerID, customerName);
		customerGrade = "VIP";// �� ��� VIP
		bonusRatio =0.05;   // ���ʽ� ���� 5%
		saleRatio = 0.1;    //������ 10% 
		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}

	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}


	public int getAgentID() {
		return agentID;
	}
	public String showVIPinfo() {
		return super.showCustomerInfo() + "��� ����� ���̵�� " + agentID + "�Դϴ�.";
	}
	


}
