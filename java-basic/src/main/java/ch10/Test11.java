package ch10;

class Monitor9 {
  int bright;
  int contrast = 50;
  int widthRes;
  int heightRes = 1080;
  
  
  Monitor9(){
    this.bright = 50;
    this.contrast = 70;
    this.widthRes = 2560;
    this.heightRes = 1200;
    System.out.println("Montor9()");
  }
  Monitor9(int bright, int contrast) {
    this.bright = bright;
    this.contrast = contrast;
    System.out.println("Montor9(int, int)");
  }
  Monitor9(int bright, int contrast, int widthRes, int heightRes){
    this.bright = bright;
    this.contrast = contrast;
    this.widthRes = widthRes;
    this.heightRes = heightRes;
    System.out.println("Montor9(int, int, int, int)");
  }
  public void on() {
    System.out.println("화면을 출력한다.");
  }
}
public class Test11 {
  
  public static void main(String[] args) {
    
    //new Monitor8();
    new Monitor9();
    new Monitor9(50, 50);
    new Monitor9(50, 50, 1920, 1080);
    
    //new Monitor9(50);
  }
}