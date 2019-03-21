// AOP 사용 - Java config로 AOP 설정하기
package ch30.g;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext(AppConfig.class);
    
    // @Component 애노테이션이 붙은 클래스의 인스턴스를 자동으로 생성한다.
    //
    System.out.println("--------------------------");
    
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.printf("%s ==> %s\n", name, iocContainer.getBean(name).getClass().getName());
    }
    
    System.out.println("--------------------------------");
    
    X x = (X) iocContainer.getBean("x");
    System.out.println(x.calculate(10, 20, "+"));
    
    try {
    System.out.println(x.calculate(10, 20, "%"));
    } catch (Exception e) {
      System.out.println("예외 발생!");
    }
  }
}




















