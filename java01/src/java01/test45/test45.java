/* 클래스 로딩
 - 1) new 연산자를 사용하여 인스턴스를 만들 때
 - 2) Class.forName("클래스이름")을 호출하여 임의로 클래스 로딩
 */
package java01.test45;

public class test45 {

  public static void main(String[] args) {
    ClassA obj1 ;
    // 클래스는 참조변수가 선언된다고 로딩되는 것이 아니다.
    
    // 참조변수를 선언할 때는  클래스가 로딩 되지 않는다.
    
    // 인스턴스 생성할 때 클래스 로딩됨.
    obj1 = new ClassA();
    
    System.out.println(ClassA.value);
    
  }

}
