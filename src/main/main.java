package main;
import view.*;

import java.io.IOException;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws IOException, SQLException {
        MailListReaderBD mlr = new MailListReaderBD();
        MailHistogramBuilder mhb = new MailHistogramBuilder(mlr.read());
        HistogramDisplay h = new HistogramDisplay(mhb.build());
        h.execute();
    }
}
