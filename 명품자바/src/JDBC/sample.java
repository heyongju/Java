package JDBC;

import java.sql.*;

public class sample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); //MySQL ����̹� �ε�
			Connection conn = DriverManager.getConnection("jdbc:mysql:// localhost:3306/sampledb",
					"root","dldydwn12!");
			System.out.println("DB ���� �Ϸ�");
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch(SQLException e) {
			System.out.println("DB ���� ����");
		}
	}

}
