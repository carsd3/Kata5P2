package view;

import model.Histogram;

import java.util.ArrayList;
import java.util.List;

public class MailHistogramBuilder {
    private Histogram<String> hist;
    private List<String> list;
     public MailHistogramBuilder(List<String> l) {
         this.hist = new Histogram<>();
         this.list = l;
         for (String m : l) {
             hist.increment(m.split("@")[1]);
         }
     }

     public Histogram<String> getHistogram() {
         return this.hist;
     }
}
