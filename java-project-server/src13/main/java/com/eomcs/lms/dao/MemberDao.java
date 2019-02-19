// 2단계: 클라이언트 연결을 승인한다.
package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.Member;

public class MemberDao extends AbstractDao<Member>{

  public MemberDao(String filepath) {
    this.filepath = filepath;
  }

  public void insert(Member member) throws Exception{
    list.add(member);
    this.saveData();
  }

  public List<Member> findAll() {
    return list;
  }

  public Member findByNo(int no) {
    for (Member b : list) {
      if (b.getNo() == no) {
        return b;
      }
    }
    return null;
  }

  public int update(Member member) throws Exception{
    int index = 0;
    for (Member b : list) {
      if (b.getNo() == member.getNo()) {
        list.set(index, member);
        this.saveData();
        return 1;
      }
      index++;
    }
    return 0;
  }

  public int delete(int no) throws Exception{
    int index = 0;
    for (Member b : list) {
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

























