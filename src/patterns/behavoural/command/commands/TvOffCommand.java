package patterns.behavoural.command.commands;

import patterns.behavoural.command.Command;
import patterns.behavoural.command.Tv;

public class TvOffCommand implements Command {

    private Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
