// 2단계: 클라이언트 연결을 승인한다.
package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.Member;

public interface MemberDao {

  void insert(Member member);
  List<Member> findAll();
  List<Member> findByKeyword(String keyword);
  Member findByNo(int no);
  int update(Member member);
  int delete(int no);
}

























