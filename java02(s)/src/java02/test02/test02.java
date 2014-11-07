/* Quiz
 - 파일을 복제하는 기능을 구현하시오.
 - $ test02 / home/bit/img1.jpg(엔터)
 - => img1.jpg 파일을 복제하여 img1-01.jpg
 
 - 힌트 : 출력은 FileOutputStream 클래스를 사용하라. 
 * 
 */
package java02.test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test02 {

  public static void main(String[] args) {
    FileInputStream in = null;
    FileOutputStream out = null;
   
    try {

      in = new FileInputStream(args[0]);
      
      
      out = new FileOutputStream("img1-01.jpg");
      
      int count = 0;
      int b = -1;

      while((b = in.read()) != -1) {
        count++;
        out.write((char)b);
      }
 
      
    } catch (FileNotFoundException ex) {
      System.out.println("읽기 오류!");
      
    } catch (IOException ex) {
      System.out.println("img1.jpg 파일을 찾을 수 없습니다.");
    
    } finally {

      try {in.close();} catch (IOException ex) {}
    }
    

  }

}