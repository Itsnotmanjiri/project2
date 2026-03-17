import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PriorityTaskManager {

    // Inner class (safe, no import issues)
    static class Task {
        String name;
        int priority; // 1 = High, 2 = Medium, 3 = Low

        Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
    }

    private List<Task> tasks;

    public PriorityTaskManager() {
        tasks = new ArrayList<>();
    }

    // Add task
    public void addTask(String name, int priority) {
        tasks.add(new Task(name, priority));
    }

    // Get tasks sorted by priority
    public List<Task> getTasksByPriority() {
        List<Task> sortedList = new ArrayList<>(tasks);

        Collections.sort(sortedList, new Comparator<Task>() {
            public int compare(Task t1, Task t2) {
                return t1.priority - t2.priority;
            }
        });

        return sortedList;
    }

    // Delete task
    public boolean deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            return true;
        }
        return false;
    }
}