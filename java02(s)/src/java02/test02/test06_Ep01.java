/*재귀 호출의 이해
 
 */

package java02.test02;

public class test06_Ep01 {
  
  // 함수 호출 통해
  public static void main(String[] args) {
    displayNo(1);
  }
  
  public static void displayNo(int no) {
    System.out.println(no);
    if(no==50)
      return;
    else
      displayNo(no+1);
  }

 /* // Quiz : 1부터 50까지의 출력
  public static void main01(String[] args) {
    
    for(int i = 1 ; i<=50 ; i++) {
      System.out.println(i);
    }
    


  }*/

}