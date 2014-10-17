package java01.test39;

public class test39 {

  public static void main(String[] args) {
   
   System.out.println("-----------------------------------");
  
   Score s = new Score("홍길동", 100, 100, 90);
   
   // 같은 기능을 수행하는 메서드에 대해서 다른 값을 출력하는 것이 오버로딩이다.
   
   Score s2 = new Score();
 
   s2.kor = 90;
   s2.eng = 90;
   
   s2.compute();
      
   System.out.println("이름 : " +s.name);
   System.out.println("국어 : " +s.kor);
   System.out.println("영어 : " +s.eng);
   System.out.println("수학 : " +s.math);
   System.out.println("합계 : " +s.sum);
   System.out.println("평균 : " +s.average);
   
   System.out.println("-----------------------------------");
   System.out.println("이름 : " +s2.name);
   System.out.println("국어 : " +s2.kor);
   System.out.println("영어 : " +s2.eng);
   System.out.println("수학 : " +s2.math);
   System.out.println("합계 : " +s2.sum);
   System.out.println("평균 : " +s2.average);
  }

}
