package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Lesson;
import java.util.Scanner;

public class LessonHandler {
  Scanner keyboard;
  final int LENGTH = 10;
  Lesson[] lessons = new Lesson[LENGTH];
  int lessonIdx = 0;
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

    lessons[this.lessonIdx] = lesson;
    this.lessonIdx++;

    System.out.println("저장하였습니다.");
  }
  public void listLesson() {
    for (int j = 0; j < this.lessonIdx; j++) {
      System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
          lessons[j].getNo(), lessons[j].getTitle(), lessons[j].getStartDate(), 
          lessons[j].getEndDate(), lessons[j].getTotalHours());
    }
  }
}
