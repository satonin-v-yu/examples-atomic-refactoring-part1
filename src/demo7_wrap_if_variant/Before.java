package demo7_wrap_if_variant;

import java.util.List;

public class Before {
    int process(List<String> outerList, List<String> list) {
        int count = 0;
        for (String outer : outerList) {
            for (String inner : list) {
                if (outer.equals(inner)) {
                    count++;
                }
            }
            count++;
        }
        count += list.size();
        return count;
    }
}
