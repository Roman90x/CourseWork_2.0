package Task;

import exception.TaskNotFoundException;

import java.util.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();

    public void add(Task task) {
        this.taskMap.put(task.getId(), task);
    }
    public void remove (Integer taskId) throws TaskNotFoundException {
        if (this.taskMap.containsKey(taskId)) {
            this.taskMap.remove (taskId);
        }else {
            throw new TaskNotFoundException(taskId);
        }
    }
    public Collection<Task> getAllByDate(LocalDate date) {
        List<Task> tasks = new LinkedList<>();
        for (Map.Entry<Integer, Task> entry : taskMap.entrySet()) {
            if (entry.getValue().appearsIn(date)) {
                tasks.add(entry.getValue());
            }
        }
        return tasks;
    }


}
