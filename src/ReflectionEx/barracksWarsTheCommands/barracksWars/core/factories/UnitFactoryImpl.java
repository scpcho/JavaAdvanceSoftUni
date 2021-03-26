package src.ReflectionEx.barracksWarsTheCommands.barracksWars.core.factories;


import barracksWarsNewFactory.interfaces.Unit;
import barracksWarsNewFactory.interfaces.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) {

		try{
			return (Unit) Class.forName(UNITS_PACKAGE_NAME+unitType).getConstructor().newInstance();

		} catch (ClassNotFoundException
				| NoSuchMethodException
				| InstantiationException
				| IllegalAccessException
				| InvocationTargetException e) {
			throw new IllegalStateException(e);
		}
	}
}
