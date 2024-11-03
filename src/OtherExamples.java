import java.util.function.Predicate;

public class OtherExamples {

    /** (page 6) Simplify 'if else' */
    boolean isEmpty(String s) {
        if (s == null || s.isEmpty()) return true;
        return false;
    }


    /** (pages 26-27) Introduce var 'data[0]' */
    void handle(String[] data) {
        if (data.length > 0) {
            System.out.println("Begin handling " + data[0]);
            before(data[0]);
        } else {
            System.out.println("Begin handling");
            before(null);
        }
        process(data);
        if (data.length > 0) {
            System.out.println("End handling " + data[0]);
            before(data[0]);
        } else {
            System.out.println("End handling");
            before(null);
        }
    }
    private void process(String[] data) {
        //...
    }
    private void before(String s) {
        //...
    }


    /** (pages 30-31) Eliminate tail recursion */
    static boolean contains(int n, Predicate<Integer> p) {
        return n >= 0 && (p.test(n) || contains(n - 1, p));
    }


    /** (page 32) Move 'return' closer to computation */
    static int compare(int x, int y) {
        int result;
        if (x < 0 && y > 0) {
            result = -2;
        } else if (x > 0 && y < 0) {
            result = 2;
        } else if (x == 0 && y < 0) {
            result = 1;
        } else if (x == 0 && y > 0) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
