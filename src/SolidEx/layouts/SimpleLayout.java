package src.SolidEx.layouts;

import src.SolidEx.enums.ReportLevel;
import src.SolidEx.layouts.interfaces.Layout;

public class SimpleLayout implements Layout {

    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format("%s - %s - %s",date,reportLevel.toString(),message);
    }
}
