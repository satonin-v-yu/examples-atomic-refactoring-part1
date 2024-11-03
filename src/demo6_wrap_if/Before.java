package demo6_wrap_if;

import java.util.List;

public class Before {
    String process(List<String> outerList, List<String> list) {
        String s = null;
        int count = 0;
        for (String outer : outerList) {
            for (String inner : list) {
                if (outer.equals(inner)) {
                    count++;
                }
            }
            if (count > 5) {
                s = outer;
                break;
            }
        }
        return s;
    }
}
