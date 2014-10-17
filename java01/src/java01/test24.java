/* 반복문
 - while (조건) 명령문;
 - while (조건) {...}
 
 
 - do 명령문; while(조건);
 - do { ... } while(조건);
 
 
 - for (초기화명령문; 조건; 증가문) { ... }
 - for (변수 : 배열이나 Collection 타입 객체 { ... }
 
 
 */

package java01;

public class test24 {

  public static void main(String[] args) {
    // 퀴즈
    // 1에서 100까지 출력하라.  단, 4의 배수를 출력하라
    // 다음과 같이 출력하라!
    // 4, 8, 12, .....
    // 단, 20의 배수일때 마다 다음 라인에 출력하라
    // 20의 배수이지만 60의 배수인 경우는 새 라인 앞에 @문자를 붙여라
    // 
    // do ~ while문을 사용하여 만들 것.
    
    long startMilliSec = System.currentTimeMillis();
    
    for(int i = 1 ; i <= 100 ; i++) {
      if(i % 4 == 0) {
        if(i % 20 == 0) {
          System.out.print(i+", ");
          System.out.println("\n");
          if(i % 60 == 0) {
            System.out.print("@");
          }
        } else
          System.out.print(i+", ");
      }
    }
    
    
  }

}
