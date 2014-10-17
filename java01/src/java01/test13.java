/* 배열
 - 같은 종류의 데이터를 여러 개 저장할 수 있도록 메모리를 여러 개 생성하는 방법
 - new 데이터형 [개수]
 - new 데이터형[]{값, 값, 값};
 
 */
package java01;


public class test13 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // 예전방법
    int kor, eng, math, sci, soc ;
    kor = 100;
    eng = 80;
    math = 100;
    sci = 90;
    soc = 100;
    
    
    // 배열 생성 : 4바이트 메모리를 연속해서 준비한다.
    // 준비 된 메모리의 첫 바이트 주소를 변수에 저장해야 한다.
    // 이렇게 주소를 저장하는 변수 => reference (참조변수)
        // C에서는 pointer라고 한다.
    
 //   int scores[] = new int[6]; // C방식도 허용 !
    int[] scores =  new int[5]; // 신규 배열 5개 생성 및 주소 할당
    scores = new int[3]; // 신규 배열 3개 생성 및 주소 할당.
   
    scores[0] = 100 ;
    scores[1] = 90 ;
    scores[2] = 80 ;
    //scores[3] = 70; // runTime Exception : 실행 중에 발생하는 오류
    
    // 배열 생성 : 값을 초기화
    // 초기화를 수행할 때는 배열의 개수를 지정하지 않는다.
    
    System.out.println("------------------------------");
    scores = new int[]{100, 90, 100} ; 
    for(int i=0 ; i<scores.length ; i++) {
      System.out.println(scores[i]);
    }
    
    System.out.println("------------------------------");
    // 특수 배열 객체 생성
    java.util.ArrayList arr = new java.util.ArrayList();
    arr.add("홍길동");
    arr.add(100);
    arr.add(90);
    arr.add(100);
    arr.add(new java.util.Date());
    
    for(int i = 0 ; i < arr.size() ; i++) {
      System.out.println(arr.get(i));
    }
    
    
    

  }

}
