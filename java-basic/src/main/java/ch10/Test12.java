package ch10;

class Monitor10 {
  int bright;
  int contrast = 50;
  int widthRes;
  int heightRes = 1080;
  
  
  Monitor10(){
    this(50, 50, 2560, 1200);
    System.out.println("Montor10()");
  }
  Monitor10(int bright, int contrast) {
    this(bright, contrast, 0, 0);
    System.out.println("Montor10(int, int)");
  }
  Monitor10(int bright, int contrast, int widthRes, int heightRes){
    this.bright = bright;
    this.contrast = contrast;
    this.widthRes = widthRes;
    this.heightRes = heightRes;
    System.out.println("Montor10(int, int, int, int)");
  }
  public void on() {
    System.out.println("화면을 출력한다.");
  }
}
public class Test12 {
  
  public static void main(String[] args) {
    
    //new Monitor8();
    new Monitor10();
    System.out.println("-------------------------");
    new Monitor10(50, 50);
    System.out.println("-------------------------");
    new Monitor10(50, 50, 1920, 1080);
    
    //Monitor10 obj1 = new Monistor10();
    //obj1.Monistor10();
  }
}