package src.ReflectionEx.barracksWarsNewFactory;

import barracksWarsNewFactory.interfaces.Repository;
import barracksWarsNewFactory.interfaces.Runnable;
import barracksWarsNewFactory.interfaces.UnitFactory;
import barracksWarsNewFactory.core.Engine;
import barracksWarsNewFactory.core.factories.UnitFactoryImpl;
import barracksWarsNewFactory.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
