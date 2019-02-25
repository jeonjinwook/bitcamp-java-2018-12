package com.eomcs.lms.handler;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;

public class MemberUpdateCommand extends AbstractCommand {

  MemberDao memberDao;

  public MemberUpdateCommand(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void execute(Response response) throws Exception {
      int no = response.requestInt("번호?");

      Member member = memberDao.findByNo(no);

      // 기존 값 복제
      Member temp = member.clone();

      String input = response.requestString("이름?");
      if (input.length() > 0) 
        temp.setName(input);
      if ((input = response.requestString("이메일?")).length() > 0)
        temp.setEmail(input);
        temp.setPassword(response.requestString("암호?"));
      if ((input = response.requestString("사진?")).length() > 0)
        temp.setPhoto(input);
      if ((input = response.requestString("전화?")).length() > 0)
        temp.setTel(input);

      memberDao.update(temp);

      response.println("회원을 변경했습니다.");

  }
}
