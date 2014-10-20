/* 호출할 수퍼 클래스 생성
 - 서브 클래스에서 어떤 수퍼 클래스 생성자를 호출할지 지정하지 않으면,
   수퍼 클래스의 기본 생성자를 호출한다.
 - 문법 : super(호출할 생성자의 파라미터 값)
 */

package java01.test41;

public class Truck extends Car {
  float weight = 1000; // kg 초기화 문장을 통해 변수의 값을 1000kg으로 한다.
  boolean autoDump;
  
  // 개발자가 클래스에 대해 생성자를 만들지 않으면,
  // 컴파일러가 자동으로 기본 생성자를 만들어 준다.
  // public Truck() {}
  
  public Truck() {
    //  수퍼 클래스의 기본 생성자가 없으면 다음과 같이 다른 수퍼 클래스의
    // 생성자를 명시적으로 호출해야 한다.
    super("미정", "미정", 800);
    autoDump = true;
  }
  
}
