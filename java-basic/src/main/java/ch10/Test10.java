package ch10;

class Monitor8 {
  int bright;
  int contrast = 50;
  int widthRes;
  int heightRes = 1080;
  
  Monitor8(int bright, int contrast) {
    this.bright = bright;
    this.contrast = contrast;
    
  }
  
  public void on() {
    System.out.println("화면을 출력한다.");
  }
}
public class Test10 {
  
  public static void main(String[] args) {
    
    //new Monitor8();
    new Monitor8(50, 50);
  }
}