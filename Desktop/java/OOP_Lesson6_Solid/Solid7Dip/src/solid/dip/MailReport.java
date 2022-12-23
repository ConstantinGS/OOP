package solid.dip;

import java.util.ArrayList;
import java.util.List;

public class MailReport implements Reportable, Printable {

    @Override
    public String dataOutput(List<ReportItem> data) {
        String reportedData = "";
        for (ReportItem item : data) {
            reportedData += "\n" + item.getDescription() + item.getAmount();
        }
        System.out.printf("Переписка: \n %s", reportedData);
        return reportedData;

    }

    @Override
    public void dataReport(List<ReportItem> data) {
        System.out.println(" \n Отправлено \n ");

    }
}