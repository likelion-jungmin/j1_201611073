package headfirst.command.undo;

public class DVDPlayCommand implements Command {
  DVD dvd;

  public DVDPlayCommand(DVD dvd) {
    this.dvd = dvd;
  }
  public void execute() {
    dvd.play();
  }
  public void undo() {
  }
}