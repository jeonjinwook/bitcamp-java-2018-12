// 2단계: 클라이언트 연결을 승인한다.
package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.Lesson;

public class LessonDao extends AbstractDao<Lesson>{

  public LessonDao(String filepath) {
    this.filepath = filepath;
  }

  public void insert(Lesson lesson) throws Exception{
    list.add(lesson);
    this.saveData();
  }

  public List<Lesson> findAll() {
    return list;
  }

  public Lesson findByNo(int no) {
    for (Lesson b : list) {
      if (b.getNo() == no) {
        return b;
      }
    }
    return null;
  }

  public int update(Lesson lesson) throws Exception{
    int index = 0;
    for (Lesson b : list) {
      if (b.getNo() == lesson.getNo()) {
        list.set(index, lesson);
        this.saveData();
        return 1;
      }
      index++;
    }
    return 0;
  }

  public int delete(int no) throws Exception{
    int index = 0;
    for (Lesson b : list) {
      if (b.getNo() == no) {
        list.remove(index);
        this.saveData();
        return 1;
      }
      index++;
    }
    return 0;
  }
}

























