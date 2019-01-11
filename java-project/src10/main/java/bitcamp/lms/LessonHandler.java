package bitcamp.lms;

import java.sql.Date;
import java.util.Scanner;

public class LessonHandler {
  final static int LENGTH = 10;
  static Scanner kb = new Scanner(System.in);
  static Lesson[] lessons = new Lesson[LENGTH];
  static int size = 0;
  public static void addLesson() {
    System.out.print("명령> lesson/add");
    System.out.println();
    Lesson lesson = new Lesson();
    System.out.print("번호: ");
    lesson.no = kb.nextInt();
    kb.nextLine();
    System.out.print("수업명: ");
    lesson.cl = kb.nextLine();
    System.out.print("수업내용: ");
    lesson.re = kb.nextLine();
    lesson.st = new Date(System.currentTimeMillis());
    System.out.print("시작일: " + lesson.st);
    System.out.println();
    System.out.print("종료일: ");
    lesson.ot = Date.valueOf(kb.nextLine());
    System.out.print("총수업시간: ");
    lesson.am = Integer.parseInt(kb.nextLine());
    System.out.print("일수업시간: ");
    lesson.tt= Integer.parseInt(kb.nextLine());
    System.out.println("저장하였습니다.");
    lessons[size++] = lesson;
  }
  public static void listLesson() {
    System.out.print("명령> lesson/list");
    System.out.println();
    for(int n = 0 ; n < size ; n++) {
      System.out.printf("%d, %s ,%s~%s ,%d\n",lessons[n].no ,lessons[n].cl,lessons[n].st,lessons[n].ot,lessons[n].am);
    }

  }

}

