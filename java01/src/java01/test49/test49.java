/* 맵에 데이터를 저장할 때 문자열이 아닌 특별한 객체를 사용하기!
 
 */
package java01.test49;

import java.util.HashMap;

public class test49 {
  // Map에 데이터를 저장할 때 특수 키를 사용하기
  public static void main(String[] args) {
    MyKey key1 = new MyKey("1234abcd", 100, 1255);
    MyKey key2 = new MyKey("1234abcd", 100, 1255);
    
    Integer key3 = new Integer(10);
    Integer key4 = new Integer(10);
    
    String key5 = new String("1234abcd");
    String key6 = new String("1234abcd");
    
    HashMap 냉장고2 = new HashMap();
    
    // Map에 데이터를 저장할 때 원리?
    // 키 객체의 hash 값을 사용하여 저장한다.
    냉장고2.put(key6, "보약");
   
   // 그리고 어머니는 놀러 가셨다.
   // 아들 퇴근..
   
   // 키로 냉장고를 열어본다.
   System.out.println(냉장고2.get(key6));
   
   // 각각 주소가 다름을 증명
   System.out.println("--------------------");
   System.out.println("key1 == key2 ?  " + (key1 == key2));
   System.out.println("key3 == key4 ?  " + (key3 == key4));
   System.out.println("key5 == key6 ?  " + (key5 == key6));
   
   System.out.println("--------------------");
   System.out.println(key1.hashCode());
   System.out.println(key2.hashCode());
   
   // 다른 인스턴스 인데 key3 key4 해시값이 같다.
   System.out.println(key3.hashCode());
   System.out.println(key4.hashCode());
   
   // 다른 인스턴스 인데 key5 key6의 해시값이 같다.   
   System.out.println(key5.hashCode());
   System.out.println(key6.hashCode());
   
/*   
   왜 Integer 객체와 String 객체의 해시 값이 같을까?
   - Object에서 상속 받은 원래 메서드는 인스턴스가 다르면
     해시 값도 다르도록 프로그램 되어있다.
   - 그런데 String 클래스와 랩퍼 클래스(Byte, Integer, ...)는
     상속받은 hashCode()를 재정의 하였다.
   => 비록 인스턴스가 다르더라도 값이 같다면 같은 해시값을 리턴 하도록 재정의 한 것이다.
*/ 
   
  }
  
  // 맵에 데이터를 저장할 때 문자열을 키로 사용하기 
  public static void main01(String[] args) {
    HashMap studentMap = new HashMap();
    
    // 복합 데이터는 메모리의 주소를 주고 받는다.
    // Map에 객체를 저장해라 => Map에 객체의 인스턴스 주소를 저장.
    
    studentMap.put("s001", new Student("홍길동", 10));
    studentMap.put("s002", new Student("임꺽정", 10));

    System.out.println(studentMap.get("s001"));
    // s001 이란 값으로 저장된 주소를 찾아가 값을 출력한다.
    System.out.println(studentMap.get("s002"));
  }

}
