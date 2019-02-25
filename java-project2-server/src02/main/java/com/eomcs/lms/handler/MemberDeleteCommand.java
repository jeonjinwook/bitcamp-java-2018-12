package com.eomcs.lms.handler;
import java.util.Scanner;
import com.eomcs.lms.dao.MemberDao;

public class MemberDeleteCommand implements Command {
  
  Scanner keyboard;
  MemberDao memberDao;
  
  public MemberDeleteCommand(Scanner keyboard, MemberDao memberAgent) {
    this.keyboard = keyboard;
    this.memberDao = memberAgent;
  }
  
  @Override
  public void execute() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      memberDao.delete(no);
      System.out.println("삭제 성공");
    } catch (Exception e) {
      
    }
  }
}
