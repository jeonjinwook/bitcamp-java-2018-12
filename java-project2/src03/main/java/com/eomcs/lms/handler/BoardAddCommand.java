package com.eomcs.lms.handler;
import java.util.Scanner;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;

public class BoardAddCommand implements Command {
  
  Scanner keyboard;
  BoardDao boardDao; // 서버의 BoardDaoImpl 객체를 대행하는 프록시 객체이다.
  
  public BoardAddCommand(Scanner keyboard, BoardDao boardAgent) {
    this.keyboard = keyboard;
    this.boardDao = boardAgent;
  }
  
  @Override
  public void execute() {
    Board board = new Board();
    
    System.out.print("내용? ");
    board.setContents(keyboard.nextLine());
    
    try {
    boardDao.insert(board);
      System.out.println("저장하였습니다.");
    } catch (Exception e) {
      System.out.printf("게시글 저장 오류! : %s\n", e.getMessage());
    }
  }
  
}
