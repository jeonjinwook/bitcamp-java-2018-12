package com.eomcs.lms.handler;
import java.util.Scanner;
import com.eomcs.lms.Agent.LessonAgent;

public class LessonDeleteCommand implements Command {

  Scanner keyboard;
  LessonAgent lessonAgent;

  public LessonDeleteCommand(Scanner keyboard, LessonAgent lessonAgent) {
    this.keyboard = keyboard;
    this.lessonAgent = lessonAgent;
  }

  @Override
  public void execute() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

   try {
     lessonAgent.delete(no);
       System.out.println("데이터 삭제 성공!");
   } catch (Exception e) {
     
   }
  }
}
