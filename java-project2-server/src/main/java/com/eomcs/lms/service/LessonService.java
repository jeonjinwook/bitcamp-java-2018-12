// 프록시 패턴 적용 - LessonDao에서 인터페이스를 추출한다.
package com.eomcs.lms.service;

import java.util.List;
import com.eomcs.lms.domain.Lesson;

public interface LessonService {
  int add(Lesson lesson);
  List<Lesson> list();
  Lesson get(int no);
  int update(Lesson lesson);
  int delete(int no);
}







