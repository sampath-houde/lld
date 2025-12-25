package patterns.behavoural.command.commands;

import patterns.behavoural.command.Command;
import patterns.behavoural.command.Tv;

public class TvOnCommand implements Command {

    private Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}

