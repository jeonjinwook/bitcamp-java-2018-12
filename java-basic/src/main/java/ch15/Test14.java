package ch15;


public class Test14 {

  public static void main(String[] args) {
    
    String[] obj2 = new String[10];
    Class classInfo = obj2.getClass();
    System.out.println(classInfo.getName());
    
    Class compTypeInfo = classInfo.getComponentType();
    System.out.println(compTypeInfo.getName());
    
    System.out.println(obj2.getClass().getComponentType().getName());
    
  }
}
