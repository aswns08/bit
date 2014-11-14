
package exam1111;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Test14 {

	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static String[] token;

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

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


			loop: 
				while (true) {

					String[] token = promptCommand();

					switch (token[0]) {
					case "add":
						doAdd(token);
						break;
					case "list":
						doList();
						break;
					case "delete":
						doDelete();
						break;
					/*case "update":
						doUpdate();
						break;*/
					case "exit":
						break loop;
					default:
						System.out.println("이 명령어를 지원하지 않습니다.");
					}

				}


		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			
			try {rs.close();} catch (Exception ex) {}
			System.out.println("ResultSet 객체의 자원을 해제함.");

			try {stmt.close();} catch (Exception ex) {}
			System.out.println("Statement 객체의 자원을 해제함.");

			try {con.close();} catch (Exception ex) {}
			System.out.println("DBMS와 연결 끊음.");
		} //finally

		scanner.close();
	}
	/*
	private static void doUpdate() throws SQLException {

		String text = null;
		String Pname;
		String Qty;
		String MKname;

		rs = stmt.executeQuery("SELECT * FROM PRODUCTS WHERE PNO=" + token[1]);
		
		while (rs.next()) {

			System.out.printf("제품명(" + rs.getString(2) + ")?");
			text = scanner.nextLine();
			if (text.length() > 0)
				Pname = text;

			System.out.printf("수량(" + rs.getInt(3) + ")?");
			text = scanner.nextLine();
			if (text.length() > 0)
				Qty = text;

			System.out.printf("제조사(" + rs.getString(4) + ")?");
			text = scanner.nextLine();
			if (text.length() > 0)
				MKname = text;
			
			stmt.executeUpdate("UPDATE PRODUCTS SET" 
			+" PNAME="+Pname+", QTY="+Qty+", ")
			
		}

		System.out.println("변경하였습니다.");

	}
*/

	private static void doDelete() throws SQLException {

		rs = stmt.executeQuery("SELECT * FROM PRODUCTS WHERE PNO="+token[1]);
		while (rs.next()) {

			System.out.print(rs.getString(2) + "를 삭제하시겠습니까?(y/n)");

		}

		if (scanner.nextLine().equalsIgnoreCase("y")) {
			
			stmt.executeUpdate("DELETE FROM PRODUCTS " + " WHERE PNO=" + token[1]);

			System.out.println("삭제하였습니다.");
		} else {
			System.out.println("삭제 취소하였습니다.");
		}

	}

	private static void doList() throws SQLException  {
		
		rs = stmt.executeQuery("select PNO, PNAME, QTY, MKNAME "
				+ " FROM PRODUCTS T1, MAKERS T2 "
				+ " WHERE T1.MKNO=T2.MKNO "
				+ " ORDER BY PNO; ");
		while ( rs.next() ) {
			System.out.print(rs.getInt(1) + ",");
			System.out.print(rs.getString(2) + ",");
			System.out.print(rs.getInt(3) + ",");
			System.out.println(rs.getString(4));	
		}

	}

	private static void doAdd(String[] token) throws SQLException {
		
		String Product;
		String Qty;
		String Maker;
		
		System.out.print("제품명 : ");
		Product = scanner.nextLine();
		
		System.out.print("수량 : ");
		Qty= scanner.nextLine();
		
		System.out.print("제조사 : ");
		Maker = scanner.nextLine();

		System.out.print("저장하시겠습니까?(y/n)");
		
		if (scanner.nextLine().equalsIgnoreCase("y")) {
			stmt.executeUpdate("INSERT INTO PRODUCTS(PNAME,QTY,MKNO)"
					+ " VALUES('"+Product+"', "+Qty+", "+Maker+")");
			
			System.out.println("저장하였습니다.");
		} else {
			System.out.println("저장 취소하였습니다.");
		}

	}
	
	private static String[] promptCommand() {
		System.out.print("명령>");
		token = scanner.nextLine().split(" ");
		return token;
	}

}







