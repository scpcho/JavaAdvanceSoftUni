package src.ReflectionEx.barracksWarsTheCommands.barracksWars.core.commands;


import barracksWarsNewFactory.interfaces.Repository;
import barracksWarsNewFactory.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class Retire extends Command {

    public Retire(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {

        try {
            this.getRepository().removeUnit(this.getData()[1]);
        } catch (ExecutionControl.NotImplementedException e) {
            e.printStackTrace();
        }
        return this.getData()[1] + " retired!";
    }
}
