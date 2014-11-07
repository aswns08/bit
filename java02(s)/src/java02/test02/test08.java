/* 문자 데이터의 읽기
 - FileReader
 - 텍스트 파일을 문자 스트림 객체를 사용하여 읽기 (텍스트 파일 외에 다른 파일은 위험하다.)
 - read() : 1문자 단위로 읽는다. => 리턴 값은 유니코드 이다.
    한 문자 => 영어(1), 한글(2 - 3) <UTF8이면 3바이트, EUC-KR이면 2바이트를 읽는다.> ... 
 - 문자 스트림은 읽어들인 데이터를 유니코드로 변환한다.
 */

package java02.test02;

import java.io.FileReader;


public class test08 {
  
  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("test01.txt");
     
    int b = -1;
    while((b = in.read()) != -1) {
      System.out.println(Integer.toHexString(b));
    }
    in.close();
  }

}
