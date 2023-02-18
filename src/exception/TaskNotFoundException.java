package exception;

public class TaskNotFoundException extends Exception {
    public TaskNotFoundException(Integer taskId) {
        super("Задача с ID = " + taskId + " не найдена!");
    }
}
