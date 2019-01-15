package ch10;

class Monitor6 {
  int bright;
  int contrast = 50;
  int widthRes;
  int heightRes = 1080;
  
  Monitor6(){
    this.bright = 50;
    this.contrast = 70;
    this.widthRes = 2560;
    this.heightRes = 1200;
  }
  
  public void on() {
    System.out.println("화면을 출력한다.");
  }
}
public class Test08 {
  
  public static void main(String[] args) {
    
    //new Monitor6;
    new Monitor6();
    
    //new Monitor6(100);
  }
}