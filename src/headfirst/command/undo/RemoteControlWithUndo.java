package headfirst.command.undo;

public class RemoteControlWithUndo {
  //Command slot;
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  
  public RemoteControlWithUndo() {
    onCommands=new Command[7];
    offCommands=new Command[7];
    //Null Object Pattern
    Command noCommand =new NoCommand();
    for (int i=0; i<7; i++) {
      onCommands[i]=noCommand;
      offCommands[i]=noCommand;
    }
    undoCommand=noCommand;
  }
  public void setCommand(int slot, Command onCommand, Command offCommand) {
    //slot=c;
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }
  public void onButtonWasPushed(int slot) {
    //slot.execute();
    onCommands[slot].execute();
    undoCommand=onCommands[slot];
  }
  public void offButtonWasPushed(int slot) {
    //slot.execute();
    offCommands[slot].execute();
    undoCommand=offCommands[slot];
  }
  public void undoButtonWasPushed() {
    undoCommand.undo();
  }
}