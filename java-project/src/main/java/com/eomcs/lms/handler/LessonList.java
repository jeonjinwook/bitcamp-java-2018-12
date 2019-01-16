package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Lesson;
import java.util.Arrays;

public class LessonList {
  static final int lengths = 10;
  Lesson[] list;
  int size = 0;
  public LessonList() {
    list = new Lesson[lengths];
  }
  public LessonList(int cmdlengths) {
    list = new Lesson[cmdlengths];
  }
  public Lesson[] toArray() {
    return Arrays.copyOf(list,size);
    
  }
  public void add(Lesson lesson) {
    if (size > list.length) {
      int oldlength = list.length;
      int newlength = oldlength + (oldlength >> 1);
      list = Arrays.copyOf(list, newlength);
    }
    list[size++] = lesson;
  }
  
}
