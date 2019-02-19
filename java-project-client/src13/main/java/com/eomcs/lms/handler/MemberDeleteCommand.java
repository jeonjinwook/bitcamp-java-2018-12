package com.eomcs.lms.handler;
import java.util.Scanner;
import com.eomcs.lms.Agent.MemberAgent;

public class MemberDeleteCommand implements Command {
  
  Scanner keyboard;
  MemberAgent memberAgent;
  
  public MemberDeleteCommand(Scanner keyboard, MemberAgent memberAgent) {
    this.keyboard = keyboard;
    this.memberAgent = memberAgent;
  }
  
  @Override
  public void execute() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      memberAgent.delete(no);
      System.out.println("삭제 성공");
    } catch (Exception e) {
      
    }
  }
}
