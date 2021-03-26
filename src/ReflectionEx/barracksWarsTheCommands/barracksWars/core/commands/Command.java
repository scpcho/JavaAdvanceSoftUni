package src.ReflectionEx.barracksWarsTheCommands.barracksWars.core.commands;


import barracksWarsNewFactory.interfaces.Executable;
import barracksWarsNewFactory.interfaces.Repository;
import barracksWarsNewFactory.interfaces.UnitFactory;

public abstract class Command implements Executable {

    private final String[] data;
    private final Repository repository;
    private final UnitFactory unitFactory;

    protected Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected String[] getData() {
        return data;
    }

    protected Repository getRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
