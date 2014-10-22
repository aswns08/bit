package java01.test48;

public class test48 {
  // hashCode() 테스트
  public static void main(String[] args) {
    Student s1 = new Student("홍길동", 10);
    Student s2 = new Student("임꺽정", 20);
    
    // 인스턴스 별로 해시코드가 다르다 (식별 값이 다르다.)
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
  }
  
  // toString() 테스트
  public static void main01(String[] args) {
    Student s1 = new Student("홍길동", 10);
    Student s2 = new Student("임꺽정", 20);
    
    System.out.println(s1.toString());
    System.out.println(s2.toString());
    
    
    // println()은 인스턴스 toString()을 호출하여 그 리턴 값을 출력한다.
    System.out.println("-------------------");
    System.out.println(s1);
    System.out.println(s2);
  }

}
