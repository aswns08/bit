package java01.test49;

public class MyKey {
  String password;
  int specialNo;
  int secretNo;
  
  public MyKey(String password, int specialNo, int secretNo) {
    this.password = password;
    this.specialNo = specialNo;
    this.secretNo = secretNo;
  }
  
  @Override
  public String toString() {
    return "MyKey [password=" + password + ", specialNo=" + specialNo
        + ", secretNo=" + secretNo + "]";
  }
  
  

}
