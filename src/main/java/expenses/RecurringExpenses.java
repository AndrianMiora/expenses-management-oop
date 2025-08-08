package expenses;

import java.time.LocalDate;

public class RecurringExpenses {
    private Recurrence recurrence;

    public RecurringExpenses(String label, double amount, LocalDate date) {
        super(amount, label, date);
        this.recurrence = recurrence;
    }
    public String toString(String recurrence) {
        return recurrence;
    }

}
