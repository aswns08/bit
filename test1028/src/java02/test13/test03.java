package java02.test13;

public class test03 {
  
  public static void main(String[] args) {
  
    // 인터페이스를 구현한 익명 이너 클래스 만들기
    // 일반 문법
    /*class MyClass2 extends Object implements MyInterface {
      @Override
      public void m2() {
        
        System.out.println("하하하");
        
      }
      
    }*/
    
    // 스냅샷 1 : 글래스명 제거
    // Object를 상속 받지 않으면 자동으로 상속 받기 때문에 Object 생략
    class MyClass2 extends Object implements MyInterface {
      @Override
      public void m2() {
        
        System.out.println("하하하");
        
      }
      
    }
    
    
  } // main
}
