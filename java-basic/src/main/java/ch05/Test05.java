package ch05;

public class Test05 {
  public static void main(String[] args) {
    String str = "ok";
    switch (str) {
      case "ok":
        System.out.println("okokok");
        break;
      case "no":
        System.out.println("nonono");
        break;
        default:
          System.out.println("????");
    }
  }
}