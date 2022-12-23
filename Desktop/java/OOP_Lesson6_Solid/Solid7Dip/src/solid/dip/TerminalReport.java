package solid.dip;

import java.util.ArrayList;
import java.util.List;

public class TerminalReport implements Printable {

    @Override
    public String dataOutput(List<ReportItem> data) {
        String reportedData = "";
        System.out.println("Output to terminal");
        for (ReportItem item : data) {
            reportedData += reportedData + "\n" + item.getDescription() + item.getAmount();
        }
        return reportedData;
    }
}