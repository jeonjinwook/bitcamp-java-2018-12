// Mybaits와 스프링 연동하기 - Java config 사용하여 연동하기
package ch29.k1;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ch29.k1.dao.BoardDao;
import ch29.k1.vo.Board;

public class Test01 {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    // java config를 다룰 때는 AnnotationConfigApplicationContext 클래스를 사용한다.
    //  => 다음과 같이 Spring IoC 컨테이너를 설정하는 모든 Java config 클래스를 지정할 수 있다.
    //      그러나 이 방법은 Java config 클래스가 추가될 때 마다
    //      계속 생성자에 그 클래스 정보를 추가해야 하는 문제가 번거로움이 발생한다.
    /*
    ApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext(
            AppConfig.class, DatabaseConfig.class, MybatisConfig.class);
     */
    //  => 그래서 실무에서는 보통 main 역할을 하는 Java confing 클래스 정보만 넘긴다.
    //      나머지 Java config 클래스들은 @Configuration을 선언하여
    //      자신이 Spring IoC 컨테이너를 설정하는 클래스임을 알린다.
    
    ApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext(AppConfig.class);

    // @Component 애노테이션이 붙은 클래스의 인스턴스를 자동으로 생성한다.
    //
    System.out.println("--------------------------");

    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.printf("%s ==> %s\n", name, iocContainer.getBean(name).getClass().getName());
    }

    System.out.println("--------------------------");

    BoardDao boardDao = (BoardDao) iocContainer.getBean("boardDao");
    List<Board> list = boardDao.findAll();
    for (Board b : list) {
      System.out.println(b);
    }

    /*
    System.out.println("--------------------------");

    Board board = new Board();
    board.setTitle("제목입니다.");
    board.setContents("내용입니다.");
    boardDao.insert(board);
    System.out.println("입력완료!");

    System.out.println("--------------------------");

    boardDao = (BoardDao) iocContainer.getBean("boardDao");
    list = boardDao.findAll();
    for (Board b : list) {
      System.out.println(b);
    }

    System.out.println("--------------------------");

    board = boardDao.findByNo(7);
    System.out.println(board);

    System.out.println("--------------------------");

    board.setTitle("오호라...병경");
    boardDao.update(board);
    System.out.println("변경완료!");

    System.out.println("--------------------------");

    board = boardDao.findByNo(7);
    System.out.println(board);

    System.out.println("--------------------------");

    boardDao.delete(7);
    System.out.println("삭제완료!");

    board = boardDao.findByNo(7);
    System.out.println(board);

    System.out.println("--------------------------");
     */
  }
}




















