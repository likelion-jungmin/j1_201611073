package headfirst.command.undo;

//noCommand -> null 아무것도 안해도 함수는 구현 해야함.
public class NoCommand implements Command {
  public void execute() {
    System.out.println("do nothing");
  }
  public void undo() {}
}