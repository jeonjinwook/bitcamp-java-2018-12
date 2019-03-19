// BeanPostProcessor - @Autowired 사용법 : 필수/선택 의존 객체 지정
package ch29.h;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test06 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext("ch29/h/application-context-06.xml");
    
    System.out.println("--------------------------");
    
    System.out.println(iocContainer.getBean("c1"));
    
  }
}




















