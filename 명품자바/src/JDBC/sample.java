package JDBC;

import java.sql.*;

public class sample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); //MySQL 드라이버 로드
			Connection conn = DriverManager.getConnection("jdbc:mysql:// localhost:3306/sampledb",
					"root","dldydwn12!");
			System.out.println("DB 연결 완료");
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch(SQLException e) {
			System.out.println("DB 연결 에러");
		}
	}

}
