/*재귀 호출의 이해
 
 */

package java02.test02;

public class test06_Ep02 {
  // Quiz : 1 - 50까지 더라하 ! 합계 출력
  
  // 함수 호출 통해
  public static void main(String[] args) {
    
    System.out.println(f(50));
  }
  
  public static int f(int no) {
    if(no == 1) {
      return no;
    } else {
      return no + f(no-1);
    }
    
  }

}
