package view;

import model.Histogram;

import java.util.ArrayList;
import java.util.List;

public class MailHistogramBuilder {
    private Histogram<String> hist;
    private List<String> list;
     public MailHistogramBuilder(List<String> l) {
         this.list = l;
         this.hist = new Histogram<>();
     }

     public Histogram<String> build() {
         for (String m : this.list) {
             hist.increment(m.split("@")[1]);
         }
         return this.hist;
     }
}
