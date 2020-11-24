package inheritance;

public class VIPCustomer extends Customer{
	private int agentID; // VIP고객 담당 상담원 아이디
	double saleRatio; //할인율
	
	public VIPCustomer(int customerID, String customerName, int agentID) {  //디폴트 생성자
		super(customerID, customerName);
		customerGrade = "VIP";// 고객 등급 VIP
		bonusRatio =0.05;   // 보너스 적립 5%
		saleRatio = 0.1;    //할인율 10% 
		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
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
		return super.showCustomerInfo() + "담당 상원담 아이디는 " + agentID + "입니다.";
	}
	


}
