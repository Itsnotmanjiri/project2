import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Add task
    public void addTask(String task) {
        tasks.add(task);
    }

    // View tasks
    public List<String> getTasks() {
        return tasks;
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