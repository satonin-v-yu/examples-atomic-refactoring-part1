package demo4_inline_anymatch;

import java.util.List;

public class Before {
    public void validateAndProcess(List<String> data1, List<String> data2) {
        if (hasEmpty(data1)) {
            throw new IllegalArgumentException("First list has empty string");
        }
        if (hasEmpty(data2)) {
            throw new IllegalArgumentException("Second list has empty string");
        }
        doProcess(data1, data2);
    }

    private boolean hasEmpty(List<String> data) {
        for (String s : data) {
            if (s == null || s.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void doProcess(List<String> data1, List<String> data2) {
        // Actual processing
    }
}
