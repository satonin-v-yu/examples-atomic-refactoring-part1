package demo2_inv_bool;

public class Before {
    void greet(String name) {
        if (name != null && !name.trim().isEmpty()) {
            System.out.println("Hello, " + name);
        }
    }
}
