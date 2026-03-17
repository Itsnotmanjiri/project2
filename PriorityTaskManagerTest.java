import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions;

public class PriorityTaskManagerTest {

    @Test
    public void testAddTask() {
        PriorityTaskManager ptm = new PriorityTaskManager();
        ptmals(1, tasks.size());
        assertEquals("Task1", tasks.get(0).name);
    }

    @Test
    public void testSorting() {
        PriorityTaskManager ptm = new PriorityTaskManager();

        ptm.addTask("Low", 3);
        ptm.addTask("High", 1);

        List<PriorityTaskManager.Task> tasks = ptm.getTasksByPriority();

        assertEquals("High", tasks.get(0).name);
    }

    @Test
    public void testDelete() {
        PriorityTaskManager ptm = new PriorityTaskManager();
        ptm.addTask("Task1", 2);

        boolean result = ptm.deleteTask(0);

        assertTrue(result);
    }
}