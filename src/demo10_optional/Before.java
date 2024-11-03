package demo10_optional;

import java.util.Optional;

public class Before {
    static void setDefaultReviewerForTaskNewStyle(Task task) {
        task.getResponsible().map(Person::getManager).ifPresent(task::setReviewer);
    }

    static void setDefaultReviewerForTaskOldStyle(Task task) {
        Optional<Person> responsible = task.getResponsible();
        if (responsible.isPresent()) {
            Person manager = responsible.get().getManager();
            if (manager != null) {
                task.setReviewer(manager);
            }
        }
    }

    private static class Person {
        private final Department department; //can be null

        public Person(Department department) {
            this.department = department;
        }

        public Person getManager() {
            return department == null ? null : department.getManager();
        }
    }

    interface Department {
        Person getManager(); // never null
    }

    interface Task {
        Optional<Person> getResponsible();

        void setReviewer(Person manager);
    }
}
