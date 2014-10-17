/* 조건문 퀴즈
 - 다음과 같이 동작하도록 프로그램을 작성하시오.
 - java java01.test18
   당신의 나이가 어떻게 되는지 다음 보기에서 고르시오.
   1) 10대 
   2) 20대 
   3) 30대 
   4) 40개 
   5) 50대
   6) 기타
   
   번호???? 3
   당신은 30대 입니다.
   
 - 사용사로부터 키보드 입력 값을 받는 방법 :
   Scanner scanner  = new Scanner(System.in);
   String input = scanner.nextLine();
 - 조건 : 반드시 switch 문을 사용하라!
   
 
 */
package java01;

public class test18 {

  public static void main(String[] args) {
     
    
    System.out.println("당신의 나이가 어떻게 되는지 보기에서 고르시오");
    System.out.println("1) 10대");
    System.out.println("2) 20대");
    System.out.println("3) 30대");
    System.out.println("4) 40대");
    System.out.println("5) 50대");
    System.out.println("6) 기타");
    System.out.print("번호를 고르시오 : ");
    
    java.util.Scanner scanner  = new java.util.Scanner(System.in);
    String input = scanner.nextLine();
    
    int age = Integer.parseInt(input);
    
    switch (age) {
    case 1: System.out.println("당신의 10대 입니다."); break;
    case 2: System.out.println("당신은 20대 입니다."); break;
    case 3: System.out.println("당신은 30대 입니다."); break;
    case 4: System.out.println("당신은 40대 입니다."); break;
    case 5: System.out.println("당신은 50대 입니다."); break;
    default: System.out.println("기타"); break;
    }
    
    

  }

}
