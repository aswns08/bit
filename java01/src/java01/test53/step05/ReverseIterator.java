package java01.test53.step05;

public class ReverseIterator extends Iterator {

  int cursor;
  
  public ReverseIterator() {
    
  }
  @Override
  public void setList(String[] list){
    /* super 키워드 : 오버라이딩 하기 전의 메서드를 가리킬 때 사용 
      - super는 수퍼 클래스를 가리키는 것이 아니다!   주의 요망!!! 
     */
    
    // 오버라이딩 : 상속 받은 메서드를 서브클래스의 역할에 맞게 돌아가게 하는 것.
    super.setList(list); // 기존 기능은 그대로 두고 
    cursor = list.length -1; // 새 명령 추가!
  }

  
  public boolean hasNext() {
    if (cursor >= 0)
      return true;
    else 
      return false;
  }
  
  public String next() {
    return list[cursor--];
  }
}










