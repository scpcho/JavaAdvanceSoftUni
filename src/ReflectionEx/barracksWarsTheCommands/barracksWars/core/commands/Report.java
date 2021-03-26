package src.ReflectionEx.barracksWarsTheCommands.barracksWars.core.commands;


import barracksWarsNewFactory.interfaces.Repository;
import barracksWarsNewFactory.interfaces.UnitFactory;

public class Report extends Command {


    public Report(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {

        return getRepository().getStatistics();
    }
}
