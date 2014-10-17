package example;

public class ex3_2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int numOfApples = 143; //사과의 개수
    int sizeOfBucket = 10; // 바구니의 크기
    int numOfBucket = (numOfApples % sizeOfBucket == 0) ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket + 1 ;
    
    System.out.println("필요한 바구니의 수 : " +numOfBucket);
        
    

  }

}
