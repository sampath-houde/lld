package patterns.behavoural.command;

import patterns.behavoural.command.commands.TvOffCommand;
import patterns.behavoural.command.commands.TvOnCommand;

public class CommandEntry {

    public static void main(String[] args) {
        Remote remote = new Remote();

        Tv tv = new Tv();
        Command turnOnCommand = new TvOnCommand(tv);
        Command turnOffCommand = new TvOffCommand(tv);

        remote.setCommand(turnOnCommand);
        remote.click();
    }
}
