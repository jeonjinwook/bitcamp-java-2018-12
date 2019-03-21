// AOP 사용 - XML 설정 대신에 애노테이션 사용하기
package ch30.f;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    // AOP 애노테이션을 사용하려면,
    //  => AOP 애노테이션을 처리할 클래스를 등록해야 한다.
    //  => <aop:aspectj-autoproxy/> 태그 선언
    ApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext("ch30/f/application-context-01.xml");
    
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




















