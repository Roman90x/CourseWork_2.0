package Task;

import exception.IncorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WeeklyTask extends Task{
    public WeeklyTask(String title, Type type, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super(title, type, dateTime, description);
    }

    @Override
    public boolean appearsIn(LocalDate dateForChecking) {
        return (dateForChecking.isAfter(getDateTime().toLocalDate()) ||
                dateForChecking.isEqual(getDateTime().toLocalDate())) &&
                dateForChecking.getDayOfWeek() == getDateTime().getDayOfWeek();
    }
}
