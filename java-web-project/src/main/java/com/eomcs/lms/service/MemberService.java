// 프록시 패턴 적용 - MemberDao에서 인터페이스를 추출한다.
package com.eomcs.lms.service;

import java.util.List;
import com.eomcs.lms.domain.Member;

public interface MemberService {
  int add(Member member);
  List<Member> list(String keyword);
  Member get(int no);
  Member get(String email, String password);
  int update(Member member);
  int delete(int no);
}







