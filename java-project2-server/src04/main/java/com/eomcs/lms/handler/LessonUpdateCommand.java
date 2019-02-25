package com.eomcs.lms.handler;
import java.sql.Date;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonUpdateCommand extends AbstractCommand {

  LessonDao lessonDao;

  public LessonUpdateCommand(LessonDao lessonDao) {
    this.lessonDao = lessonDao;
  }

  @Override
  public void execute(Response response) throws Exception {
      int no = response.requestInt("번호?");



      Lesson lesson = lessonDao.findByNo(no);
      // 일단 기존 값을 복제한다.
      Lesson temp = lesson.clone();

      String input = response.requestString("수업명?");
      if (input.length() > 0) 
        temp.setTitle(input);

      if ((input = response.requestString("내용?")).length() > 0)
        temp.setContents(input);

      if ((input = response.requestString("시작일?")).length() > 0)
        temp.setStartDate(Date.valueOf(input));

      if ((input = response.requestString("종료?")).length() > 0)
        temp.setEndDate(Date.valueOf(input));

      if ((input = response.requestString("총수업시간?")).length() > 0)
        temp.setTotalHours(Integer.parseInt(input));

      if ((input = response.requestString("일수업시간?")).length() > 0)
        temp.setDayHours(Integer.parseInt(input));

      lessonDao.update(temp);

      response.println("수업을 변경했습니다.");

  }
}
