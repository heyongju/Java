package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company mycompany1 = Company.getInstance();
		Company mycompany2 = Company.getInstance();
		System.out.println(mycompany1 == mycompany2);
	}
	

}
