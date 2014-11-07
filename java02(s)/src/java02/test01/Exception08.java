/* finally 블록
 - try 블록에서 예외가 발생하든 ㅇ나하든 반드시 실행하는 블록
 - try 블록에서 생성한 자원을 해제하는 코드를 둔다.
 - 
 */
package java02.test01;

import java.util.Scanner;

// RunTimeException을 사용하지 않을 때! 고통!!
// => 상위 호출자에게 오류를 던지기 위해 
//    메서드 선언에 반드시 throws 명령을 붙여야한다.
// 예) printCompute(), printContent(), printPage()를 보라!
public class Exception08 {

  static int a;
  static int b;
  static String op;
  
    static class Calculator {
   // Exception 대신 RuntimeException을 던진다.
      // => Error처럼 메서드 선언부에 지정하지 않아도 된다.
      
     public static int compute(int a, int b, String op) /*throws Exception*/ {
        switch(op) {
        case "+": return a+b;
        case "-": return a-b;
        default:
            throw new RuntimeException("지원하지 않는 연산자 입니다.");
        }
      }
      
    }
    
   // compute() 에서는 RunTimeException을 던진다.
   // try... catch 로 처리하지 않으면,
    // ********자동******** 으로 상위 호출자에게 던진다.
   // throws절을 선언하지 않아도 된다.
   public static void printResult() /*throws Exception*/ {
     System.out.println("a = " +a);
     System.out.println("b = " +b);
     System.out.println("결과는 = " + Calculator.compute(a, b, op));
   }
   
   
   public static void printContent() /*throws Exception*/ {
     System.out.println("******************");
     printResult();
     System.out.println("******************");
   }
   
   // 일반 메서드 호출 하듯이 printPage()를 호출할 수 있다.
   // throws절 생략 가능 ! = > 코드가 간결해짐.
   public static void printPage() /*throws Exception*/ {
     System.out.println("머리말 정보 ....");
     printContent();
     System.out.println("꼬리말 정보 ....");
   }
   
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    
     System.out.println("a=");
     a = Integer.parseInt(scanner.nextLine());
     
     System.out.println("b=");
     b = Integer.parseInt(scanner.nextLine());
     
     System.out.println("연산자=");
     op = scanner.nextLine();
     
     // compute()에서 발생된 예외를 중간의 메서드에서는 처리할 필용가 없다.
     // 이렇게 처음 호출자가 통합하여 처리하면 됌.
     // 오류관리가 쉽고, 코드가 간결해짐.
     try {
       printPage();
     } catch (Exception ex) {
       System.out.println(ex.getMessage());
     } finally {
       // try 또는 catch 블록을 벗어나기 전에 반드시 실행하는 블록
       System.out.println("오호라....");
     }
     
   }

 }
