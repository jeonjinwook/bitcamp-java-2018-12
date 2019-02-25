package com.eomcs.lms.handler;
import java.util.Scanner;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;

public class BoardUpdateCommand implements Command {

  BoardDao boardDao;
  Scanner keyboard;
  
  public BoardUpdateCommand(Scanner keyboard, BoardDao boardAgent) {
    this.keyboard = keyboard;
    this.boardDao = boardAgent;
  }

  @Override
  public void execute() {

    try {
      System.out.print("번호? ");
      Board board = new Board();
      board.setNo(Integer.parseInt(keyboard.nextLine()));
      
      System.out.printf("내용? ");
      board.setContents(keyboard.nextLine());
      if (boardDao.update(board) == 0) {
        System.out.println("해당 번호의 게시물이 없습니다.");
        return;
      }

      System.out.println("변경했습니다.");

    } catch (Exception e) {
      System.out.println("변경 중 오류 발생!");
    }
  }
}
