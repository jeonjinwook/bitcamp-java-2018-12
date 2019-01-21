package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.ArrayList;
public class MemberHandler {

  Scanner keyboard;
  ArrayList<Member> list;

  public MemberHandler(Scanner keyboard) {
    this.keyboard = keyboard;
    this.list = new ArrayList<>();
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

  public void detailMember() {
    int no = kb();
    int index = indexOf(no);
    if (!validate(index))
      return;

    Member member = list.get(index);

    if (member == null) {
      System.out.println("해당 수업을 찾을수기없습니다.");
      return;
    }
    System.out.printf("이름: %s \n", member.getName());
    System.out.printf("이메일: %s \n", member.getEmail());
    System.out.printf("암호: %s \n", member.getPassword());
    System.out.printf("사진: %s \n", member.getPhoto());
    System.out.printf("전화: %s \n", member.getTel());
    System.out.printf("가입일: %s \n", member.getRegisteredDate());
  }

  private int indexOf(int no) {
    for (int i = 0; i < list.size(); i++) {
      Member item = list.get(i);
      if (item.getNo() == no) {
        return i;
      }
    }
    return -1;
  }
  private int kb() {
    System.out.print("번호? ");
    return Integer.parseInt(keyboard.nextLine());
  }
  
  private boolean validate(int index) {
    if (index == -1) {
      System.out.println("수업을 찾을수가 없습니다.");
      return false;
    }
    return true;
  }

  public void deleteMember() {
    int no = kb();
    int index = indexOf(no);
    
    if(!validate(index)) {
      return;
    }
    list.remove(index);
    System.out.println("수업을 삭제 했습니다.");
  }
}
