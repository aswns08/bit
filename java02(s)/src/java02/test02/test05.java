/* File 기본 사용.
 - 
 */
package java02.test02;

import java.io.File;

public class test05 {

  public static void main(String[] args) throws Exception {
   
    File f = new File("../../bit/java01(s)");

    System.out.println(f.getAbsolutePath());
 // 결과 : /home/bit/javaide/workspace/java02(s)/../../bit/java01(s)
    
    System.out.println(f.getCanonicalPath());
 // 결과 : /home/bit/javaide/bit/java01(s)
    
    System.out.println(f.getPath());
 // 결과 : ../../bit/java01(s)
    
    System.out.println(f.getName());
 // 결과 : java01(s)
    
    System.out.println(f.getParent());
 // 결과 : ../../bit
  }

}
