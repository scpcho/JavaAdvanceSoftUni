package src.InterfacesAndAbstractionEx.military.interfaces;

import src.InterfacesAndAbstractionEx.military.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);

    Collection<Repair> getRepairs();
}
