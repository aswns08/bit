/* 조건문 퀴즈
 - 프로그램 아규먼트로 나이를 입력받아 청소년, 청년.. 등의 여부를 출력하시오
 - 참고 문법 :
   문자열을 숫자로 바꾸는 방법
   String s = "23";
   int i =  Integer.parseInt(s);
   
 
 */
package java01;

public class test20 {

  public static void main(String[] args) {
     
  //  if( args.length != 1)
  //    return;
    
    
    int age = Integer.parseInt(args[0]);
    
    switch(age/10) {
    case 1: System.out.println("10대 입니다.");
    break;
    case 2: System.out.println("20대 입니다.");
    break;
    case 3: System.out.println("30대 입니다.");
    break;
    case 4: System.out.println("40대 입니다.");
    break;
    case 5: System.out.println("50대 입니다.");
    break;
    case 6: System.out.println("기타..");
    break;
    }

  }

}
