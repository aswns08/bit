/* 2단계
 - 하드 코딩되어 있는 데이터 부분을 외부에서 입력 받도록 기능 개선.
 */
package java01.test53.step02;

public class test02 {

  public static void main(String[] args) {
    
    Iterator iterator = new Iterator(args); // 프로그램 아규먼트로 받는다.
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }

}
