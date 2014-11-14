/* Connection 객체 얻기
 * => java.sql.Driver 구현체를 통해서 얻을 수 있다.
 * => Driver Manager에게 부탁하면,
 * DriverManager가
 */

package java02.test14;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc02 {

	public static void main(String[] args) throws Exception  {
		
		Connection con = null;
		try {
		// 방법1 . java.sql.Driver 구현체 로딩한다.
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("JDBC 드라이버 로딩됨.");

		// 2. DriverManager에게 Connection 객체를 부탁한다. 
		con = DriverManager.getConnection(
				/* jdbc 접속을 위한 URL정보. DBMS마다 형식이 약간씩 다르다. */
				"jdbc:mysql://localhost:3306/studydb",  
				"study", /* 사용자 아이디 */
				"study"); /* 사용자 암호 */
		System.out.println("DBMS에 연결됨.");
		
		} catch (Exception ex) {
			ex.printStackTrace();
		
		} finally {
			
			try {con.close();} catch (Exception ex) {}
			System.out.println("DBMS와 연결 끊음.");
		} //finally
		
	} // main

} // class
