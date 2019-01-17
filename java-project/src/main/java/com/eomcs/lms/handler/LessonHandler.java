package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Lesson;
import java.util.Scanner;

public class LessonHandler {
  Scanner keyboard;
  ArrayList list = new ArrayList();
  public LessonHandler(Scanner keyboard) {
    this.keyboard = keyboard;
  }
  public void addLesson() {
    Lesson lesson = new Lesson();

    System.out.print("번호? ");
    lesson.setNo(Integer.parseInt(this.keyboard.nextLine()));

    System.out.print("수업명? ");
    lesson.setTitle(this.keyboard.nextLine());

    System.out.print("설명? ");
    lesson.setContents(this.keyboard.nextLine());

    System.out.print("시작일? ");
    lesson.setStartDate(Date.valueOf(this.keyboard.nextLine()));

    System.out.print("종료일? ");
    lesson.setEndDate(Date.valueOf(this.keyboard.nextLine()));

    System.out.print("총수업시간? ");
    lesson.setTotalHours(Integer.parseInt(this.keyboard.nextLine()));

    System.out.print("일수업시간? ");
    lesson.setDayHours(Integer.parseInt(this.keyboard.nextLine()));

    list.add(lesson);
    System.out.println("저장하였습니다.");
  }
  public void listLesson() {
   Object[] lessons = list.toArray();
    for (Object lesson : lessons) {
      System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
          ((Lesson)lesson).getNo(), ((Lesson)lesson).getTitle(), ((Lesson)lesson).getStartDate(), 
          ((Lesson)lesson).getEndDate(), ((Lesson)lesson).getTotalHours());
    }
  }
}
