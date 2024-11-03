package demo9_inline_iterable;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Before {
    public static <T> HashSet<T> newHashSet(@NotNull Iterable<? extends T> elements) {
        if (elements instanceof Collection) {
            Collection<? extends T> collection = (Collection<? extends T>) elements;
            return new HashSet<>(collection);
        }
        HashSet<T> set = new HashSet<>();
        for (T element : elements) set.add(element);
        return set;
    }

    static <T> void someBusinessLogic(Iterable<String> in1, Collection<T> in2, List<? extends T> in3) {
        HashSet<String> set1 = newHashSet(in1);
        HashSet<T> set2 = newHashSet(in2);
        HashSet<T> set3 = newHashSet(in3);
        set2.addAll(set3);
        // hundreds more
    }
}
