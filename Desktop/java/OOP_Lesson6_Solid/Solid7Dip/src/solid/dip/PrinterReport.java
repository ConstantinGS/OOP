package solid.dip;

import java.util.ArrayList;
import java.util.List;

public class PrinterReport implements Reportable {

    @Override
    public void dataReport(List<ReportItem> data) {
        System.out.println("Печать");

    }
}