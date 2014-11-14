package java02.test13;

public class test02 {

  public static void main(String[] args) {
     // 4) ananymous inner class
    // 한 번만 사용하는 인스턴스를 만들 때는
    // 익명 이너 클래스로 만들어라.
    
    // 기존 클래스 상속 받아서 익명 이너 클래스 만들기
    // 문법 : new 수퍼클래스() {}
    // 익명 이너 클래스는 클래스를 별도로 정의할 수 없다. ==> 이름이 없기 때문에
    // 이너 클래스를 정의하자마자 즉시 인스턴스를 생성해야한다.
    MyClass p = new MyClass() { // MyClass를 상속 받은 익명 서브 클래스
      // 상속 받은 메서드 오버라이딩
     @Override
    public void m() {

      super.m(); // 기존 메서드 호출
      System.out.println("ok"); // 출력 추가.
    }
      
    }; // MyClass
    p.m();
    // 익명 이너 클래스의 생성자를 지정할 때 수퍼 클래스의 생성자를 지정한다.
    // 즉, 다음은 MyClass의 다른 생성자를 호출하는 예이다.
    new MyClass(30) {
      @Override
      public void m() {
        i *=i;
        super.m();
      }
    }.m();

  }

}
