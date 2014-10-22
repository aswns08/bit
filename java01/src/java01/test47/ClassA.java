package java01.test47;

public class ClassA {
  static int value = 10 ;
  
  static {
    System.out.println("ClassA : static 블록 실행");
    ClassB.value = 100; // 클래스B를 로딩 (클래스B가 로딩 되지 않으면 값을 넣을 수 없다.!
    
    System.out.println("ClassA : ClassB.value = " + ClassB.value);
    System.out.println("ClassA : value = " + value);
  }
}
