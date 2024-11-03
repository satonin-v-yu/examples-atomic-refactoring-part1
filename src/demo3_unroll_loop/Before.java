package demo3_unroll_loop;

public class Before {
    private static String[] getConferences() {
        return new String[]{"JPoint"};
    }

    void processConferences() {
        for (String conference : getConferences()) {
            System.out.println("I'm going to visit "+conference);
        }
    }
}
