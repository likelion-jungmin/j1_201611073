package headfirst.command.undo;

//noCommand -> null �ƹ��͵� ���ص� �Լ��� ���� �ؾ���.
public class NoCommand implements Command {
  public void execute() {
    System.out.println("do nothing");
  }
  public void undo() {}
}