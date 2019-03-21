// AOP 사용 후 - AOP 설정 다루기
package ch30.c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext("ch30/c/application-context-02.xml");
    
    // @Component 애노테이션이 붙은 클래스의 인스턴스를 자동으로 생성한다.
    //
    System.out.println("--------------------------");
    
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.printf("%s ==> %s\n", name, iocContainer.getBean(name).getClass().getName());
    }
    
    System.out.println("--------------------------------");
    
    X x = (X) iocContainer.getBean("x");
    x.m1();
  }
}




















