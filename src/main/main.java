package main;
import model.*;
import view.*;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        MailListReader mlr = new MailListReader("email.txt");
        MailHistogramBuilder mhb = new MailHistogramBuilder(mlr.getList());
        HistogramDisplay h = new HistogramDisplay(mhb.getHistogram());
        h.execute();
    }
}
