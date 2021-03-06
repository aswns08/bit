package java01;
/* Wrapper class
 - 기본 데이터형(primitive date type)의 값을
   좀 더 다양하게 다룰 수 있도록 자바에서는 기본 형에 대응하는
   클래스를 제공한다. => 이것을 랩퍼 클래스라 한다.
   
   byte => java.lang.Byte
   short => java.long.Short
   int => java.lang.Integer
   long => java.lang.Long
   float => java.lang.Float
   double => java.lang.Double
   boolean => java.lang.Boolena
   char => java.lang.Character
 
 */


public class test32 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // 참고! 클래스를 지정할 때는 반드시 패키지 이름을 적어야 한다.
    // 단, java.lang 패키지만 안 적어도 된다.
    // 그러나 java.lang 하위 패키지는 적아야한다.
    byte pb = 20;
    Byte b = new Byte(pb);
    
    //랩퍼 클래스에는 기본 값을 다루는 도우미 메서드가 있다.
    double d2 = b.doubleValue();
    String str = b.toString();
    
    
    short ps = 30;
    Short s = new Short(ps);
    
    Integer i = new Integer(30);
    Long l = new Long(40);
    Float f = new Float(20.0f);
    Double d = new Double(20);
    Boolean bool = new Boolean(true);
    Character c = new Character('A');
    
    
  }

}
