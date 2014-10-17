/* switch
 - 특정 값에 따라 명령어의 실행을 분기할 때 사용
 - 문법
   switch(4바이트 이하 정수 값, byte, short, int, char) {
   case 값:
           명령어...
           break;
   default: // else를 의미
           명령어...
   }
 
 - JDK 7부턴 switch 문에 문자열을 넣을 수 있다.
   
 
 */
package java01;

public class test19 {

  public static void main(String[] args) {
     
    byte b = 10; // ok
    short s = 10 ; // ok
    char c = '가' ; //ok
    int i = 10 ; // ok
    long l = 10L; // error
    float f = 10.0f; // error
    double d = 10.0 ; // error
    boolean bool = true ; // error
    String str = "okok"; // ok
        
    switch (str) {
    
    default: System.out.println("기타"); break;
    }
    
    

  }

}
