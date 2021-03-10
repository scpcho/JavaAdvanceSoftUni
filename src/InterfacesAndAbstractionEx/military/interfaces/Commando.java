package src.InterfacesAndAbstractionEx.military.interfaces;

import src.InterfacesAndAbstractionEx.military.Mission;

import java.util.Collection;

public interface Commando {

    void addMission(Mission mission);

    Collection<Mission> getMissions();

}
