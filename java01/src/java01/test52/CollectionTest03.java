/* HashSet 사용
 - 데이터 중복을 허용하지 않는다.
 - 데이터가 같은지 비교할 때 해시코드를 사용한다.
 - 따라서, 인스턴스가 달라도 해시코드가 같다면 같은 데이터로 취급한다.
 
 - 어떤 바구니를 사용할지 용도에 따라 구분.
   ex) 중복이 허용 가능한 ArrayList 와  중복을 허용하지 않는 HashSet
 */
package java01.test52;


import java.util.HashSet;


public class CollectionTest03 {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    
    // 배열에 저장해서 해쉬값을 비교하는 것이 아니기 때문에 속도가 느리지 않다.
    System.out.println("s1 :"+s1.hashCode());
    System.out.println("s2 :"+s2.hashCode());
    System.out.println("s3 :"+s3.hashCode());
    
    
    System.out.println("---------------------------");
    HashSet<String> set = new HashSet<String>();
    set.add("Hello");
    set.add("Hello");
    set.add(new String("Hello"));
    set.add("오호라");
    
    for(String value : set) {
      System.out.println(value);
    }
  
  
  
  
  
  
  }

}
