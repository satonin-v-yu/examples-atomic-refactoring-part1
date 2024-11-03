package demo5_inline_continue;

import java.util.List;

public class Before {
    public void processAll(List<String> list) {
        for (String s : list) {
            process(s);
        }
    }

    private void process(String str) {
        if (str == null) return;
        str = str.trim();
        if (str.isEmpty()) return;
        if (str.startsWith("//")) {
            //Comment: do not process
            return;
        }
        System.out.println("Processing string " + str);
    }
}
