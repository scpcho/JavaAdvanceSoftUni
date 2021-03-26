package src.ReflectionEx.barracksWarsTheCommands.barracksWars.core.commands;


import barracksWarsNewFactory.interfaces.Repository;
import barracksWarsNewFactory.interfaces.Unit;
import barracksWarsNewFactory.interfaces.UnitFactory;

public class Add extends Command {

    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = getUnitFactory().createUnit(unitType);
        getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}
