package src.ReflectionEx.barracksWarsNewFactory.interfaces;


import barracksWarsNewFactory.interfaces.Executable;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
