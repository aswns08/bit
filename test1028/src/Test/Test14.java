/* 데이터 보관처리
 - File I/O API를 사용하여 데이터를 저장하고 꺼낸다.
 - load(), save() 메서드 준비

 - CSV(comma seperated value) 문자열을 가지고 객체를 초기화할 수 있도록 
   Score13에 생성자 추가한다.
 */
package Test;

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
						doUpdate(Integer.parseInt(token[1]));
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
	private static void doUpdate() 
			throws CloneNotSupportedException {
		
		rs = stmt.executeQuery("SELECT * FROM PRODUCTS WHERE PNO="+token[1]);
		while (rs.next()) {

			System.out.print(rs.getString(2) + "의 성적을 삭제하시겠습니까?(y/n)");

		}


		String text = null;
		System.out.printf("이름(%s):", score.getName());
		text = scanner.nextLine();
		if (text.length() > 0)
			tempScore.setName(text);

		System.out.printf("국어(%d):", score.getKor());
		text = scanner.nextLine();
		if (text.length() > 0)
			tempScore.setKor(Integer.parseInt(text));

		System.out.printf("영어(%d):", score.getEng());
		text = scanner.nextLine();
		if (text.length() > 0)
			tempScore.setEng(Integer.parseInt(text)); 

		System.out.printf("수학(%d):", score.getMath());
		text = scanner.nextLine();
		if (text.length() > 0)
			tempScore.setMath(Integer.parseInt(text));

		System.out.print("정말 변경하시겠습니까?(y/n)");
		if (scanner.nextLine().equalsIgnoreCase("y")) {
			
			System.out.println("변경하였습니다.");
		} else {
			System.out.println("변경 취소하였습니다.");
		}

	}
	
*/

	private static void doDelete() throws SQLException {

		rs = stmt.executeQuery("SELECT * FROM PRODUCTS WHERE PNO="+token[1]);
		while (rs.next()) {

			System.out.print(rs.getString(2) + "의 성적을 삭제하시겠습니까?(y/n)");

		}

		if (scanner.nextLine().equalsIgnoreCase("y")) {
			
			stmt.executeUpdate("DELETE FROM PRODUCTS " + " WHERE PNO=" + token[1]);

			System.out.println("삭제하였습니다.");
		} else {
			System.out.println("삭제 취소하였습니다.");
		}

	}

	private static void doList() throws SQLException  {
		
		rs = stmt.executeQuery("SELECT * FROM PRODUCTS");
		while ( rs.next() ) {
			System.out.print(rs.getInt(1) + ",");
			System.out.print(rs.getString(2) + ",");
			System.out.print(rs.getInt(3) + ",");
			System.out.println(rs.getInt(4));	
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







