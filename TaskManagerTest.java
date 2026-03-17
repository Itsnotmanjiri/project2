import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;



public class TaskManagerTest {

    @Test
    public void testAddTask() {
        TaskManager tm = new TaskManager();
        tm.addTask("Study");

        List<String> tasks = tm.getTasks();

        assertEquals(1, tasks.size());
        assertEquals("Study", tasks.get(0));
    }

    @Test
    public void testDeleteTask() {
        TaskManager tm = new TaskManager();
        tm.addTask("Task1");

        boolean result = tm.deleteTask(0);

        assertTrue(result);
    }

    @Test
    public void testDeleteInvalid() {
        TaskManager tm = new TaskManager();

        boolean result = tm.deleteTask(5);

        assertFalse(result);  // ❌ Fail case check
    }
}