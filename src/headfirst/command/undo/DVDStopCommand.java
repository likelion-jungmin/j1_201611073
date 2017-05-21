package headfirst.command.undo;

public class DVDStopCommand implements Command {
  DVD dvd;

  public DVDStopCommand(DVD dvd) {
    this.dvd = dvd;
  }
  public void execute() {
    dvd.stop();
  }
  public void undo() {
  }
}