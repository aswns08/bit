package java01.test38;

public class test38 {

  public static void main(String[] args) {
    String name = "홍길동";
    int kor = 100;
    int eng = 100;
    int math = 90;
    int sum = 290;
    float average = (float)sum / 3;
   
    System.out.println("이름 : " +name);
    System.out.println("국어 : " +kor);
    System.out.println("영어 : " +eng);
    System.out.println("수학 : " +math);
    System.out.println("합계 : " +sum);
    System.out.println("평균 : " +average);
    
   Score s = new Score("홍길동", 100, 100, 90);
   System.out.println("-----------------------------------");
   // new Score();
   // 1) new Score : Score 클래스에 정의된 인스턴스 변수를 Heap에 준비한다.
   // 2) (): 호출할 생성자를 선택하는 명령어.
   //        값을 안 주면 ~    
   // 생성자 중에서 파라미터 값을 받지 않는 생성자(기본 생성자)를 호출하라.
   // 생성자는 나중에 따로 호출 할 수 있다.
   // 반드시 new 명령 다음에 즉시 호출해야 한다.
   
   
   System.out.println("-----------------------------------");
   System.out.println("이름 : " +s.name);
   System.out.println("국어 : " +s.kor);
   System.out.println("영어 : " +s.eng);
   System.out.println("수학 : " +s.math);
   System.out.println("합계 : " +s.sum);
   System.out.println("평균 : " +s.average);
   
  }

}
