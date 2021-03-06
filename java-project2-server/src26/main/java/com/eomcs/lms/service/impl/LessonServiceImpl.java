package com.eomcs.lms.service.impl;

import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.lms.service.LessonService;

// Spring IoC 컨테이너가 관리하는 객체 중에서
// 비즈니스 로직을 담당하는 객체는
// 특별히 그 역할을 표시하기 위해 @Component 대신에 @Service 애노테이션을 붙인다.
// 이렇게 애노테이션으로 구분해두면 나중에 애노테이션으로 객체를 찾을 수 있다.
@Service
public class LessonServiceImpl implements LessonService {

  LessonDao lessonDao;
  PhotoBoardDao photoBoardDao;
  PhotoFileDao photoFileDao;

  public LessonServiceImpl(PhotoFileDao photoFileDao, PhotoBoardDao photoBoardDao,LessonDao lessonDao) {
    this.lessonDao = lessonDao;
    this.photoBoardDao = photoBoardDao;
    this.photoFileDao = photoFileDao;

  }

  // 비즈니스 객체에서 메서드 이름은 가능한 업무 용어를 사용한다.
  @Override
  public List<Lesson> list() {
    return lessonDao.findAll();
  }

  @Override
  public int add(Lesson lesson) {
    return lessonDao.insert(lesson);
  }

  @Override
  public Lesson get(int no) {
    Lesson lesson = lessonDao.findByNo(no);
    return lesson;
  }

  @Override
  public int update(Lesson lesson) {
    return lessonDao.update(lesson);
  }

  @Override
  @Transactional(propagation=Propagation.REQUIRED) 
  public int delete(int no) {

    HashMap<String,Object> params = new HashMap<>();
    params.put("lessonNo", no);
    List<PhotoBoard> boards = photoBoardDao.findAll(params);
    for (PhotoBoard board : boards) {
      photoFileDao.deleteByPhotoBoardNo(board.getNo());
      photoBoardDao.delete(board.getNo());
    }
    return lessonDao.delete(no);
  }
}











