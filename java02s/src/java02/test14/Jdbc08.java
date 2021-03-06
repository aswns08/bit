/* UPDATE 실행
 * 
 * executeUpdate() 실행.
 */

package java02.test14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc08 {

	public static void main(String[] args) throws Exception  {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("JDBC 드라이버 로딩됨.");

		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studydb" +
						"?useUnicode=true&characterEncoding=utf8",  
				"study", 
				"study"); 
		System.out.println("DBMS에 연결됨.");
		
		stmt = con.createStatement();
		System.out.println("Statement 객체 준비 완료.");
		
		stmt.executeUpdate("UPDATE PRODUCTS SET" +
		" PNAME='넥서스10', QTY=1200" +
		" WHERE PNO=8");
		System.out.println("데이터 변경 완료.");
		
	
	
		
		} catch (Exception ex) {
			ex.printStackTrace();
		
		} finally {
		
			
			try {stmt.close();} catch (Exception ex) {}
			System.out.println("Statement 객체의 자원을 해제함.");
			
			try {con.close();} catch (Exception ex) {}
			System.out.println("DBMS와 연결 끊음.");
		} //finally
		
	} // main

} // class
