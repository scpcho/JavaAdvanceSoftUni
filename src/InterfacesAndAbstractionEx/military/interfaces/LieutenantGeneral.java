package src.InterfacesAndAbstractionEx.military.interfaces;

import src.InterfacesAndAbstractionEx.military.PrivateImpl;

import java.util.List;

public interface LieutenantGeneral {
    void addPrivate(PrivateImpl priv);

    List<PrivateImpl> getPrivates();
}
