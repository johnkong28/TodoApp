import java.util.Comparator;

public class TaskComparators {
    public static class ByDifficulty implements Comparator<Task> {
        @Override
        public int compare(Task a, Task b) {
            return a.getDifficulty().compareTo(b.getDifficulty());
        }
    }
    public static class ByDueTime implements Comparator<Task> {
        @Override
        public int compare(Task a, Task b) {
            return a.getDueTime().compareTo(b.getDueTime());
        }
    }
    public static class ByCompleted implements Comparator<Task> {
        @Override
        public int compare(Task a, Task b) {
            return a.getCompleted().compareTo(b.getCompleted());
        }
    }
}
