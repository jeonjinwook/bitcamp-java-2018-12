package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Member;

public class MemberList {
  static final int lengths = 10;
  Member[] list;
  int size = 0;
  MemberList(){
    this.list = new Member[lengths];
  }
  MemberList(int cmdlengths) {
    this.list = new Member[lengths];
  }
  public Member[] Arrays() {
return Arrays.copyOf(list, size);
  }
  void add(Member member) {
    if (size >= list.length) {
      int oldlength = list.length;
      int newlength = oldlength + (oldlength >>1);
      list = java.util.Arrays.copyOf(list, newlength);
    }
    list[size++] = member;
  }
}
