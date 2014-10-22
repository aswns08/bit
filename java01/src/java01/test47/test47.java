/* 클래스 로딩
 - 1) 인스턴스 생성 시(최초 로딩)
 - 2) class.forName("클래스명") 호출
 - 3) 클래스 변수 사용 시
 */

package java01.test47;

public class test47 {

  public static void main(String[] args) {
    new ClassA();
    System.out.println(ClassA.value);

  }

}
