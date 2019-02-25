package com.eomcs.lms.handler;
import com.eomcs.lms.dao.MemberDao;

public class MemberDeleteCommand extends AbstractCommand {

  MemberDao memberDao;

  public MemberDeleteCommand(MemberDao memberAgent) {
    this.memberDao = memberAgent;
  }

  @Override
  public void execute(Response response) throws Exception {
      int no = Integer.parseInt(response.requestString("번호?"));

      memberDao.delete(no);
      response.println("삭제 성공");
  }
}
