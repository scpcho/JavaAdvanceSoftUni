package src.ReflectionEx.barracksWarsReturn.barracksWars.interfaces;


import barracksWarsNewFactory.interfaces.Unit;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType);
}
