package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.ArrayList;

public class BoardHandler {
  Scanner keyboard;
  ArrayList<Board> list;
  
  public BoardHandler(Scanner keyboard) {
    this.keyboard = keyboard;
    this.list = new ArrayList<>(20);
  }
  
  public void listBoard() {
    Board[] boards = list.toArray(new Board[] {});
    
    for (Board board : boards) {
      System.out.printf("%3d, %-20s, %s, %d\n", 
          board.getNo(), board.getContents(), 
          board.getCreatedDate(), board.getViewCount());
    }
  }

  public void addBoard() {
    Board board = new Board();
    
    System.out.print("번호? ");
    board.setNo(Integer.parseInt(keyboard.nextLine()));
    
    System.out.print("내용? ");
    board.setContents(keyboard.nextLine());
    
    board.setCreatedDate(new Date(System.currentTimeMillis())); 
    
    board.setViewCount(0);
    
    list.add(board);
    
    System.out.println("저장하였습니다.");
  }
  
  
  public void updateBoard() {
    int no = kb();
    int index = indexOf(no);
    
    if(!validate(index))
      return;
    
    Board board = list.get(index);
    Board temp = new Board();
    
    temp.setNo(board.getNo());
    temp.setCreatedDate(board.getCreatedDate());
    temp.setViewCount(board.getViewCount());
    
    System.out.printf("내용(%s)",board.getContents());
    String arr = keyboard.nextLine();
    if(arr.length() > 0) {
      temp.setContents(arr);
    } else {
      temp.setContents(board.getContents());
    }
    list.set(index, temp);
   
  }
  
  
  public void deleteBoard() {
    int no = kb();
    int index = indexOf(no);
    
    if(!validate(index)) {
      return;
    }
    list.remove(index);
    System.out.println("수업을 삭제했습니다.");
    }

  public void detailBoard() {
    int no = kb();
    int index = indexOf(no);
    if(!validate(index)) {
      return;
    }
    
    Board board = list.get(index);
    
    if (board == null) {
      return;
    }
    System.out.printf("내용은: %s\n",board.getContents());
    System.out.printf("작성일: %s\n",board.getCreatedDate());
  }

  private boolean validate(int index) {
    if (index == -1) {
      System.out.println("수업을 찾을 수 없습니다.");
      return false;
    }
    return true;
  }

  private int indexOf(int no) {
    for (int i = 0; i < list.size(); i++) {
      Board board = list.get(i);
      if(board.getNo() == no) {
      return i;
    }
    }
    return -1;
  }

  private int kb() {
    System.out.print("번호? ");
    return Integer.parseInt(keyboard.nextLine());
  }
    
}
