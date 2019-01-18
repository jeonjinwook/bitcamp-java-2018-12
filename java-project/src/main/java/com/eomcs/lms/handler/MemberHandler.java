package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
public class MemberHandler {
  
  Scanner keyboard;
  ArrayList<Member> list;
  
  public MemberHandler(Scanner keyboard) {
    this.keyboard = keyboard;
    this.list = new ArrayList<>();
  }
  public void detailMember() {
    System.out.println("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());
    int index = indexOfMember(no);
    if (index == -1) {
      System.out.println("해당 게시글을 찾을 수 없습니다.");
      return;
  }
    Member member = list.get(index);
    System.out.printf("%s\n", member.getName());
    System.out.printf("%s \n", member.getEmail());
    System.out.printf("%s \n", member.getPassword());
    System.out.printf("%s \n", member.getPhoto());
    System.out.printf("%s \n", member.getTel());
    System.out.printf("%s \n", member.getRegisteredDate());
    
  }
  
  public void listMember() {
    Member[] members = list.toArray(new Member[0]);
    for (Member member : members) {
      System.out.printf("%3d, %-4s, %-20s, %-15s, %s\n", 
          member.getNo(), member.getName(), member.getEmail(), 
          member.getTel(), member.getRegisteredDate());
    }
  }
  public void addMember() {
    Member member = new Member();

    System.out.print("번호? ");
    member.setNo(Integer.parseInt(this.keyboard.nextLine()));

    System.out.print("이름? ");
    member.setName(this.keyboard.nextLine());

    System.out.print("이메일? ");
    member.setEmail(this.keyboard.nextLine());

    System.out.print("암호? ");
    member.setPassword(this.keyboard.nextLine());

    System.out.print("사진? ");
    member.setPhoto(this.keyboard.nextLine());

    System.out.print("전화? ");
    member.setTel(this.keyboard.nextLine());

    member.setRegisteredDate(new Date(System.currentTimeMillis())); 

    list.add(member);
    System.out.println("저장하였습니다.");
  }
  private int indexOfMember(int no) {
    for (int i = 0 ; i < list.size ; i ++ ) {
      Member m = list.get(i);
      if (m.getNo() == no)
      return i;
    }
    return -1;
  }
}
