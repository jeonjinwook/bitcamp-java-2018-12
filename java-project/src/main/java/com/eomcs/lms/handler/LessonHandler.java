package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Lesson;
import java.util.Scanner;

public class LessonHandler {
  Scanner keyboard;
  ArrayList<Lesson> list;
  
  public LessonHandler(Scanner keyboard) {
    this.keyboard = keyboard;
    this.list = new ArrayList<>();
  }
  public void detailLesson() {
    System.out.println("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());
    int index = indexOfLesson(no);
    if (index == -1) {
      System.out.println("해당 게시글을 찾을 수 없습니다.");
      return;
    }
    Lesson lesson = list.get(index);
    System.out.printf("%d\n", lesson.getNo());
    System.out.printf("%s\n", lesson.getTitle());
    System.out.printf("%s\n", lesson.getContents());
    System.out.printf("%s ~ %s\n", lesson.getStartDate(), lesson.getEndDate());
    System.out.printf("%d\n", lesson.getTotalHours());
    System.out.printf("%d\n", lesson.getDayHours());
  }
  
  public void listLesson() {
    Lesson[] lessons = list.toArray(new Lesson[0]);
    for (Lesson lesson : lessons) {
      System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
          lesson.getNo(), lesson.getTitle(), lesson.getStartDate(), 
          lesson.getEndDate(), lesson.getTotalHours());
    }
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
  private int indexOfLesson(int no) {
    for (int i = 0 ; i < list.size ; i ++) {
      Lesson l = list.get(i);
      if (l.getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}
