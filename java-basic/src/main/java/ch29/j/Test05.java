// Java config - @PropertySource 사용법
package ch29.j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test05 {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    
    ApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext(AppConfig5.class);
    
    // @Component 애노테이션이 붙은 클래스의 인스턴스를 자동으로 생성한다.
    //
    System.out.println("--------------------------");
    
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.printf("%s ==> %s\n", name, iocContainer.getBean(name).getClass().getName());
    }
  }
}




















