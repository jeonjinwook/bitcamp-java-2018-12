package com.eomcs.lms.handler;

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
  static Member[] Arrays() {
    
  }
  void add(Member member) {
    if (size >= list.length) {
      int oldlength = list.length;
      int newlength = oldlength + (oldlength >>1);
      Member[] list = java.util.Arrays.copyOf(size, newlength);
    }
    list[size++] = member;
  }
}
