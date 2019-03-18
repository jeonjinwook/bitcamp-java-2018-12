// 패키지를 탐색하여 빈을 자동 생성하기
package ch29.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test03_j {

  public static void main(String[] args) {
    // 객체 생성
    //  @bean public Student b1() { return new Student(); }
    //
    ApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext(Appconfig03.class);
    
 // 스프링 IoC 컨테이너가 생성한 객체 꺼내기
    //  => @component 가 붙은 클래스의 인스턴스를 꺼낼 때는
    //      클래스이름으로 꺼낸다. 단 클래스의 첫 번째 알파벳은 소문자로 지정한다.
    Student2 obj1 = (Student2)iocContainer.getBean("student2");
    System.out.println(obj1);
    
    // @Component가 붙지 않은 클래스는 자동으로 객체를 생성하지 않는다.
    Student obj2 = (Student)iocContainer.getBean("student");
    System.out.println(obj2);
    
    System.out.println("실행 완료!");
  }

}




















