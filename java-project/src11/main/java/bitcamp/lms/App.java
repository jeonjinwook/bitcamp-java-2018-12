package bitcamp.lms;
import java.util.Scanner;
public class App {
static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      String cmd = prompt();
      if(cmd.equalsIgnoreCase("lesson/add")) {
        LessonHandler.addLesson();
      }else if(cmd.equalsIgnoreCase("lesson/list")){
        LessonHandler.listLesson();;
      }else if(cmd.equalsIgnoreCase("member/add")) {
        MemberHandler.addMember();
      }else if(cmd.equalsIgnoreCase("member/list")) {
        MemberHandler.listMember();
      }else if(cmd.equalsIgnoreCase("board/add")) {
        BoardHandler.addBoard();
      }else if(cmd.equalsIgnoreCase("board/list")) {
        BoardHandler.listBoard();
      }else if(cmd.equalsIgnoreCase("quit")){
        end();
        break;
      }else{
      }
    }
  }
  static void end() {
    System.out.print("명령> quit");
    System.out.println();
    System.out.println("안녕");
  }
  static String prompt() {
    System.out.print("명령> ");
    String cmd = kb.nextLine();
    return cmd;
  }
}
