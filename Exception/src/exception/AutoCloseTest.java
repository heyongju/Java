package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		try(AutoCloseobj obj = new AutoCloseobj()) {
			throw new Exception();
		}catch(Exception e){
			System.out.println("���� �κ��Դϴ�.");
		}
	
//		AutoCloseobj obj = new AutoCloseobj();
//		try(AutoCloseobj obj2 = obj)
//		throw new Exception();
//	}catch (Exception e) {
//		System.out.println("���� �κ��Դϴ�.");
	}

}
