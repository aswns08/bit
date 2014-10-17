/* 클래스 변수
- 클래스를 로딩할 때 준비되는 변수
- Method Area 영역에 준비됨.!!!!!!!!!!!!!!!!!!!!!!!!!!!! (중요))
- JVM이 실행을 종료할 때까지 유지

 
* 로컬변수
- 함수가 호출될 때 준비되는 변수
- stack 영역에 준비됨
- 함수 호출이 끝나면 제거된다.


* 인스턴스 변수
- 인스턴스가 생성될 때 준비되는 변수
- Heap 영역에 준비됨.
- 가비지 컬렉터에 의해 해제되기 전까지 존재한다. 
 */
package java01.test28;

// 주제 : Calculator의 기능을 이용하여 다음 계산을 수행하라.

// 단, 계산은 순차적으로 실행하라. (즉, 연산자 우선순위 적용하지 말라!)
// 10 + 2 * 7 - 4 / 2 = ?


// 단계5 : 클래스 분리!
//        => calculator 클래스를 정의하고, 계산과 관련된 기능을 분리한다.

public class test28 {
  
  public static void main(String[] args) {
 // 10 + 2 * 7 - 4 / 2 = ?
    
 // 클래스 변수나 인스턴스 변수는 자동 초기화 된다.
 // 따라서 다음과 같이 별도로 초기화 할 필요가 없다.
 
    // Calculator.result = 0 ;
    
    Calculator.plus(10);
    Calculator.plus(2);
    Calculator.multiple(7);
    Calculator.result = -100;
    Calculator.minus(4);
    Calculator.divide(2);
    
    System.out.println("결과는 = " + Calculator.result);
    
    
  }

}
