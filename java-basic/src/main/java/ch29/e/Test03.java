// 프로퍼티 값 호출 - List 프로퍼티 값 설정하기
package ch29.e;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext("ch29/e/application-context-03.xml");
    
    System.out.println("--------------------------");
    
    System.out.println(iocContainer.getBean("c1"));
  }
}




















