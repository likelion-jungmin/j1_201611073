package headfirst.command.undo;

public class RemoteLoader {

 public static void main(String[] args) {
  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

  Light light = new Light();
  DVD dvd = new DVD();
 
  LightOnCommand lightOn = new LightOnCommand(light);
  LightOffCommand lightOff = new LightOffCommand(light);
  DVDPlayCommand DVDplay = new DVDPlayCommand(dvd);
  DVDStopCommand DVDstop = new DVDStopCommand(dvd);
  
  remoteControl.setCommand(0, lightOn, lightOff);
  remoteControl.setCommand(1, DVDplay, DVDstop);
  System.out.println(remoteControl);
  
  remoteControl.onButtonWasPushed(0);
  remoteControl.offButtonWasPushed(0);
  remoteControl.onButtonWasPushed(1);
  remoteControl.offButtonWasPushed(1);
 }
}