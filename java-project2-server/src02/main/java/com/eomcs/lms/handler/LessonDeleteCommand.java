package com.eomcs.lms.handler;
import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;

public class LessonDeleteCommand implements Command {

  Scanner keyboard;
  LessonDao lessonDao;

  public LessonDeleteCommand(Scanner keyboard, LessonDao lessonAgent) {
    this.keyboard = keyboard;
    this.lessonDao = lessonAgent;
  }

  @Override
  public void execute() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

   try {
     lessonDao.delete(no);
       System.out.println("데이터 삭제 성공!");
   } catch (Exception e) {
     
   }
  }
}
