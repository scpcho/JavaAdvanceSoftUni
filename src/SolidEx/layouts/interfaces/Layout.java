package src.SolidEx.layouts.interfaces;

import src.SolidEx.enums.ReportLevel;

public interface Layout {
    String format(String date, ReportLevel reportLevel, String message);
}
