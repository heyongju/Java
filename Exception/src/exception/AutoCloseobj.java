package exception;

public class AutoCloseobj implements AutoCloseable{
	
	@Override
	public void close() throws Exception{
		System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
	}

}
