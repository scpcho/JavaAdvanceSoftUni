package src.SolidEx;

import src.SolidEx.appenders.SocketAppender;
import src.SolidEx.appenders.interfaces.Appender;
import src.SolidEx.layouts.XmlLayout;
import src.SolidEx.layouts.interfaces.Layout;
import src.SolidEx.loggers.MessageLogger;
import src.SolidEx.loggers.interfaces.Logger;

import java.io.IOException;

public abstract class Functionality {

    public static void connectToServer(String dade,String message) throws IOException {
        Layout layout = new XmlLayout();
        Appender appender = new SocketAppender(layout);
        Logger logger = new MessageLogger(appender);
        logger.logInfo("16.03.20021","Hello Gogo");
    }
}
