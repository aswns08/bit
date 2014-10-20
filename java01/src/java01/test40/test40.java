/* 서브 클래스의 인스턴스 생성 과정
 - 수퍼 클래스의 명령어에 따라 먼저 인스턴스 변수를 생성한 다음에
 - 서브 클래스의 명령어에 따라 인스턴스 변수를 생성한다.
 
 
 */
package java01.test40;

public class test40 {

  public static void main(String[] args) {
    Car c1 = new Car("현다이", "마구타", 1997);
    
    Car c2 = new Car("가이야", "M5", 2500);
    
    Truck t1 = new Truck(); // 기본 생성자 호출(default constructor)
    /*
    인스턴스 변수 준비 과정
    1) car 클래스에 선언된 대로 인스턴스 변수를 준비한다.
      : maker, model, cc, diesel, releaseDate, capacity
    
    2) Truck 클래스에 선언된 인스턴스 변수 준비
      : weight
    3) 각 인스턴스 변수는 0으로 초기화 한다.
        - byte, short, int, long => 모든 비트 0
        - float, double => 0.0 => 모든 비트 0
        - char => '\u0000' => 모든 비트 0
        - boolean => false => 모든 비트 0
      - 래퍼런스 => false => 모든 비트 0
    3) 초기화 문장 수행(super 클래스의 명령어부터 실행)
    4) 생성자 호출( Truck()호출 => car()호출 ) /
    */
    
    
/*  1) 인스턴스 변수 준비
       [maker][model][cc][diesel][releasDate][capacity][weight][autoDump]
 
    2) 인스턴스 변수를 0으로 초기화
       [0]    [0]    [0] [0]     [null](0)   [0]       [0.0]   [false](0)
    
    3) car 클래스의 초기화 문장 수행 
       [0]    [0]    [0] [0]     [null](0)   [5]       [0.0]   [false](0)
    
       Truck 클래스의 초기화 문장 수행
       [0]    [0]    [0] [0]     [null](0)   [5]       [1000.0][false](0)
    
    4) Truck 클래스 생성자 호출하는 즉시 Car 생성자 호출
       ["미정"]["미정"][800][0]  [null](0)   [5]       [1000.0][false](0)
       
    5) Track 클래스 생성자 실행
       ["미정"]["미정"][800][0]  [null](0)   [5]       [1000.0][true]
 */ 
    
  }

}
