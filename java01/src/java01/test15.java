/* 프로그램 아규먼트
 - JVM을 실행할 때 프로그램에게 전달하는 파라미터 값
 - 전달 방법
   java -classpath ./bin:/okok/a:/test/a/b 클래스명 값1 값2 값3.... (엔터)
   값1, 값2, 값3이 프로그램 아규먼트이다.
   (classpath는 jvm이 경로를 찾는 것을 알려줌)
 
 - 프로그램 아규먼트를 꺼내는 방법
   main()의 args 파라미터를 사용하라!
   각각의 아규먼트 값이 배열에 저장되어 main() 호출 시 넘어온다.
    
 */
package java01;

public class test15 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("프로그램 아규먼트 개수: "+args.length);
    System.out.println("프로그램 아규먼트 값: ");
    for(int i = 0 ; i < args.length; i++) {
      System.out.println(args[i]);
    }
    
  }

}
